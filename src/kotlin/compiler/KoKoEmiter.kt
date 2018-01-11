/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
 package kokoslan.kotlin.compile

import kokoslan.kotlin.ast.*
import java.util.*

interface KoKoEmiter {
	
	fun PROGRAM(stmts:MutableList<KoKoAst>) = KoKoProgram(stmts)
	
	fun LET(id:KoKoAst, expr:KoKoAst) = KoKoLet(id, expr)
  
	fun OPERATOR(operator:String) = KoKoId(operator)
	
	fun OPERATION(operator:KoKoAst, operands:MutableList<KoKoAst>) = KoKoOperation(operator, operands)
	
	fun BI_OPERATION(operator:KoKoAst, left:KoKoAst, right:KoKoAst):KoKoAst {
		val id = operator as KoKoId
		when (id.value) {
			"+" -> return KoKoPLUS(operator, left, right)
			"-" -> return KoKoMINUS(operator, left, right)
			"*" -> return KoKoMULT(operator, left, right)
			"/" -> return KoKoDIV(operator, left, right)
			">" -> return KoKoMAYOR(operator, left, right)
			else -> return KoKoBiOperation(operator, left, right)
		}
	}
  
	fun NUM(value:Double) = KoKoNum(value)
  
	fun ID(value:String) = KoKoId(value)
  
	fun LIST(expressions:List<KoKoAst>) = KoKoList(expressions)
  
	fun LIST() = KoKoList()
	
	fun CALL_ARGS( expressions : MutableList<KoKoAst> ) = KoKoCallArgs(expressions) 

	fun CALL_ARGS() = KoKoCallArgs()
	
	fun CALL(head:KoKoAst, args:KoKoCallArgs) = KoKoCall(head, args)
	
	fun LAMBDA(pattern : KoKoAst, expression : KoKoAst) = KoKoLambda(pattern, expression)
	
	fun LAMBDALLAVES( expressions : MutableList<KoKoAst> ) =  KoKoLambdaLlaves( expressions )
	
	fun EVALCONDITION(condition : KoKoAst, test : KoKoAst?) = KoKoEvalCondition(condition, test)

    fun EVALPARENTCONDITION( condition: KoKoAst ,  test : KoKoAst? ) = KoKoEvalParentCondition( condition, test )
  
	fun TEST_EXPRESSION(exp_true : KoKoAst, exp_false : KoKoAst) = KoKoTestExpression(exp_true, exp_false)
	
	fun NEGATION( cantidad : Int, condition: KoKoAst ) = KoKoNegation(cantidad, condition)
  
	fun PRINT( expression : KoKoAst ) = KoKoPrint(expression)

	fun PARENT_EXP( expression : KoKoAst ) = KoKoParentExp( expression )

	fun PATTERN( pattern : MutableList<KoKoAst>, pipe : String ) = KoKoPattern( pattern, pipe )

	fun RESTBODYPAT(id : KoKoAst ) = KoKoRestBodyPat( id )

	fun FIRST( lista : MutableList<KoKoAst> ) = KoKoFirst(lista)

	fun REST ( lista : MutableList<KoKoAst> ) = KoKoRest(lista)

	fun CONS (lista : MutableList<KoKoAst> ) = KoKoCons(lista)

	fun FAIL() = KoKoFail()

	fun INSERTLISTPAT (lista : MutableList<KoKoAst>) = KoKoInsertListPat(lista)

	companion object {
		val TRUE = KoKoBool(true)
		val FALSE = KoKoBool(false)
		val PLUS:KoKoAst = KoKoId("+")
		val MINUS:KoKoAst = KoKoId("-")
		val MULT:KoKoAst = KoKoId("*")
		val DIV:KoKoAst = KoKoId("/")
		val MAYOR:KoKoAst= KoKoId(">")
		val ERROR:KoKoAst = KoKoId("??")
	}
}