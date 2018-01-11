/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
 package kokoslan.kotlin.compile

import kokoslan.kotlin.ast.*
import kokoslan.parser.*

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree

import java.util.*
import java.util.stream.*
import java.io.*

class KoKoCompiler(val outputFile:String? = null):KoKoslanBaseVisitor<KoKoAst>(), KoKoEmiter {
	var program:KoKoAst? = null
	var statements:MutableList<KoKoAst> = mutableListOf()

	fun getProgram() = PROGRAM(this.statements)

	fun genCode() {
		try{
			genCode(if (outputFile == null) System.out else PrintStream(outputFile))
		}
		catch (e:Exception) {
			throw RuntimeException(e.message)
		}
	}

	fun genCode(out:PrintStream) {
		this.statements.forEach{
			it.genCode(out)
		}
	}

	fun eval() = getProgram().eval()

	fun compile(tree:ParseTree) = visit(tree)

	override fun visitProgram(ctx:KoKoslanParser.ProgramContext):KoKoAst? {
		ctx.definition().map( {f -> visit(f)} )
							.forEach{ this.statements.add(it) }
		this.program = PROGRAM(this.statements)
		val expr = visit(ctx.expression())
		this.statements.add(expr)
		return this.program
	}

	override fun visitDefinition(ctx:KoKoslanParser.DefinitionContext):KoKoAst {
		val id = visit(ctx.id())
		var expr : KoKoAst
		if(ctx.expression() != null)
			expr = visit(ctx.expression())
		else
			expr = visit(ctx.negation())
		return LET(id, expr)
	}

    override fun visitEvalConditionParent(ctx: KoKoslanParser.EvalConditionParentContext): KoKoAst {
        val condition = visit(ctx.condition())
        var test : KoKoAst? = null
        if(ctx.test_expr() != null)
            test = visit( ctx.test_expr() )
        return EVALPARENTCONDITION(condition, test)
    }

	override fun visitEvalConditionExpr( ctx :KoKoslanParser.EvalConditionExprContext) : KoKoAst {
		val condition = visit(ctx.condition())
		var test : KoKoAst? = null
		if(ctx.test_expr() != null)
			test = visit( ctx.test_expr() )
		return EVALCONDITION(condition, test)
	}

	override fun visitParentValueExpr(ctx : KoKoslanParser.ParentValueExprContext) : KoKoAst {
		val exp = visit(ctx.expression())
		return PARENT_EXP(exp)
	}

	override fun visitAtomicValueExpr(ctx : KoKoslanParser.AtomicValueExprContext) : KoKoAst {
		return visit(ctx.atomic_value())
	}

	override fun visitAdd_oper(ctx:KoKoslanParser.Add_operContext) = OPERATOR(ctx.oper.getText())

	override fun visitBoolean_oper(ctx: KoKoslanParser.Boolean_operContext) = OPERATOR(ctx.oper.getText())

	override fun visitId(ctx:KoKoslanParser.IdContext) = ID(ctx.ID().getText())

	override fun visitNumber(ctx:KoKoslanParser.NumberContext) = NUM(java.lang.Double.valueOf(ctx.NUMBER().getText()))

	override fun visitBool(ctx:KoKoslanParser.BoolContext) = if ((ctx.TRUE() != null)) KoKoEmiter.TRUE else KoKoEmiter.FALSE

	override fun visitMult_oper(ctx:KoKoslanParser.Mult_operContext) = OPERATOR(ctx.oper.getText())

	override fun visitAdd_expr(ctx:KoKoslanParser.Add_exprContext):KoKoAst {
		if (ctx.add_oper() == null)
			return visit(ctx.mult_expr(0))

		val operators = ctx.add_oper().map{ visit(it) }
		val operands = ctx.mult_expr().map{ visit(it) }
		val r = arrayOf<KoKoAst>(operands[0])
		( 1 until operands.size ).forEach{
			r[0] = BI_OPERATION(operators[it - 1], r[0], operands[it] )
		}
		return r[0]
	}

	override fun visitMult_expr(ctx:KoKoslanParser.Mult_exprContext):KoKoAst {
		if (ctx.mult_oper() == null){
			return visit(ctx.value_expr(0))
		}
		val operators = ctx.mult_oper().map{ visit(it) }
		val operands = ctx.value_expr().map{ visit(it) }

		if(operands[0]==null){
			return visit(ctx.value_expr(0))
		}
		else{
			val r = mutableListOf<KoKoAst>(operands[0])
			( 1 until operands.size ).forEach{ r[0] = BI_OPERATION(operators[it - 1], r[0], operands[it]) }
			return r[0]
		}
	}

	override fun visitCallValueExpr(ctx:KoKoslanParser.CallValueExprContext):KoKoAst {
		val head = visit(ctx.value_expr())
		val args = visit(ctx.call_args()) as KoKoCallArgs
		return CALL(head, args)
	}

	override fun visitLambda_expr( ctx:KoKoslanParser.Lambda_exprContext) : KoKoAst{
		val pattern = visit(ctx.pattern())
		val expression = visit(ctx.expression())
		return LAMBDA(pattern, expression)
	}
	
	override fun visitLambda_llaves(ctx: KoKoslanParser.Lambda_llavesContext): KoKoAst {
        val expressions = ctx.expression().map { visit(it) }
		return LAMBDALLAVES(expressions as MutableList<KoKoAst>)
    }

	override fun visitCondition( ctx:KoKoslanParser.ConditionContext) : KoKoAst{
		if (ctx.boolean_oper() == null){
			return visit(ctx.cont(0))
		}

		val operators = ctx.boolean_oper().map{ visit(it) }
		val operands = ctx.cont().map{ visit(it) }
		val r = arrayOf<KoKoAst>(operands[0])
		( 1 until operands.size ).forEach{
			r[0] = BI_OPERATION(operators[it - 1], r[0], operands[it] )
		}
		return r[0]
	}

	override fun visitTest_expr( ctx : KoKoslanParser.Test_exprContext ) : KoKoAst{
		val exp_true = visit(ctx.expression(0))
		val exp_false = visit(ctx.expression(1))
		return TEST_EXPRESSION(exp_true, exp_false)
	}

	override fun visitNegation(ctx: KoKoslanParser.NegationContext) : KoKoAst {
		var cantidad = ctx.neg_oper().size
		val condicion = visit(ctx.condition())
		return NEGATION(cantidad, condicion)
	}

	override fun visitCall_args(ctx:KoKoslanParser.Call_argsContext):KoKoAst {
		if(ctx.list_expr() != null){
			var expressions = ctx.list_expr().map{ visit(it) }
			return CALL_ARGS(expressions as MutableList)
		}
		return CALL_ARGS()
	}

	override fun visitList_value(ctx : KoKoslanParser.List_valueContext ) : KoKoAst{
		if(ctx.list_expr() == null)
			return LIST()
		else{
            val expressions = ctx.list_expr().expression().get(0).part_expr().map{ visit(it) }
            return LIST(expressions)
        }
	}

	override fun visitList_expr(ctx:KoKoslanParser.List_exprContext):KoKoAst {
		val exprs = ctx.expression().map{ visit(it) }
		return LIST(exprs)
	}

	override fun visitListValueExpr(ctx : KoKoslanParser.ListValueExprContext) : KoKoAst {
		return visit(ctx.list_value())
	}

	override fun visitPrint(ctx : KoKoslanParser.PrintContext) : KoKoAst {
		val exp = visit(ctx.expression())
		return PRINT(exp)
	}

	override fun visitPattern(ctx : KoKoslanParser.PatternContext) : KoKoAst {
		return if( ctx.list_pat() != null) visit(ctx.list_pat()) else visit(ctx.atomic_pat())
	}

    override fun visitList_pat(ctx: KoKoslanParser.List_patContext): KoKoAst {
        return if( ctx.list_body_pat() != null  ) visit(ctx.list_body_pat()) else PATTERN(mutableListOf(), "")
    }

    override fun visitList_body_pat(ctx: KoKoslanParser.List_body_patContext): KoKoAst {
        var lista = mutableListOf<KoKoAst>()
		if(ctx.pattern().size > 0)
			lista = ctx.pattern().map{ visit(it) } as MutableList
		if( ctx.rest_body_pat() != null ) {
            lista.add(visit(ctx.rest_body_pat()))
			return PATTERN(lista, "pipe")
        }
		return PATTERN(lista, "")
    }

    override fun visitRest_body_pat(ctx: KoKoslanParser.Rest_body_patContext): KoKoAst {
        return if( ctx.list_pat() != null ) RESTBODYPAT(visit(ctx.list_pat())) else visit(ctx.id())
    }

    override fun visitFirst(ctx: KoKoslanParser.FirstContext): KoKoAst {
        val list = visit( ctx.list_value() )
		return FIRST( list as MutableList<KoKoAst> )
    }

    override fun visitRest(ctx: KoKoslanParser.RestContext): KoKoAst {
        val list = visit( ctx.list_value() )
		return REST( list as MutableList<KoKoAst>)
    }

    override fun visitCons(ctx: KoKoslanParser.ConsContext): KoKoAst {
        if(ctx.list_value().size > 1){
			val listas = ctx.list_value().map { visit(it) }
			return CONS(listas as MutableList<KoKoAst>)
        }
		return CONS(visit(ctx.list_value(0)) as MutableList<KoKoAst>)
    }

    override fun visitFail(ctx: KoKoslanParser.FailContext): KoKoAst {
        return FAIL()
    }

    override fun visitInsert_list_pat(ctx: KoKoslanParser.Insert_list_patContext): KoKoAst {
        val list = ctx.atomic_pat().map{ visit(it) }
		return INSERTLISTPAT(list as MutableList<KoKoAst>)
    }

}