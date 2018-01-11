// Generated from grammar/KoKoslan.g4 by ANTLR 4.7
package kokoslan.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KoKoslanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KoKoslanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(KoKoslanParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(KoKoslanParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KoKoslanParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#part_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_expr(KoKoslanParser.Part_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#lambda_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expr(KoKoslanParser.Lambda_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#lambda_llaves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_llaves(KoKoslanParser.Lambda_llavesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvalAddTest}
	 * labeled alternative in {@link KoKoslanParser#evaluable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalAddTest(KoKoslanParser.EvalAddTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvalAddTestParentesis}
	 * labeled alternative in {@link KoKoslanParser#evaluable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalAddTestParentesis(KoKoslanParser.EvalAddTestParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvalConditionParent}
	 * labeled alternative in {@link KoKoslanParser#evaluable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalConditionParent(KoKoslanParser.EvalConditionParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvalConditionExpr}
	 * labeled alternative in {@link KoKoslanParser#evaluable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalConditionExpr(KoKoslanParser.EvalConditionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InsertListPat}
	 * labeled alternative in {@link KoKoslanParser#evaluable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertListPat(KoKoslanParser.InsertListPatContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(KoKoslanParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#add_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_oper(KoKoslanParser.Add_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(KoKoslanParser.Mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#mult_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_oper(KoKoslanParser.Mult_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#test_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_expr(KoKoslanParser.Test_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(KoKoslanParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(KoKoslanParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#neg_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_oper(KoKoslanParser.Neg_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#cont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont(KoKoslanParser.ContContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#boolean_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_oper(KoKoslanParser.Boolean_operContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseNegation}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseNegation(KoKoslanParser.CaseNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentValueExpr(KoKoslanParser.ParentValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallValueExpr(KoKoslanParser.CallValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValueExpr(KoKoslanParser.ListValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseValueExpr(KoKoslanParser.CaseValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomicValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicValueExpr(KoKoslanParser.AtomicValueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#call_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_args(KoKoslanParser.Call_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#atomic_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_value(KoKoslanParser.Atomic_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#list_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_value(KoKoslanParser.List_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#list_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_expr(KoKoslanParser.List_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#insert_list_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_list_pat(KoKoslanParser.Insert_list_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#case_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_value(KoKoslanParser.Case_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(KoKoslanParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(KoKoslanParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#atomic_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_pat(KoKoslanParser.Atomic_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#list_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_pat(KoKoslanParser.List_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#list_body_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_body_pat(KoKoslanParser.List_body_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#rest_body_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest_body_pat(KoKoslanParser.Rest_body_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(KoKoslanParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(KoKoslanParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(KoKoslanParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#left_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_par(KoKoslanParser.Left_parContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(KoKoslanParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(KoKoslanParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest(KoKoslanParser.RestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(KoKoslanParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#fail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFail(KoKoslanParser.FailContext ctx);
}