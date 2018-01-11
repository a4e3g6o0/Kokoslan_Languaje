/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.util.*
import java.io.*

data class KoKoLambda(var pattern:KoKoAst, var expr:KoKoAst, var lambda_ctx : KoKoContext = KoKoContext(null)) : KoKoAst{
	
	override fun genCode(out: PrintStream){
		out.print("\\")
		this.pattern.genCode(out)
		out.print(". ")
		this.expr.genCode(out)
	}
	
	override fun eval(ctx : KoKoContext) : KoKoValue{
		this.lambda_ctx = KoKoContext(ctx)
		this.lambda_ctx.assoc(KoKoId("#ALA#"), KoKoNullValue(pattern.toString()))
		return KoKoLambdaValue(this)
	}
	
	fun eval(valor : List<KoKoAst>): KoKoValue{
		var lista = valor[0].eval(lambda_ctx) as KoKoListValue
		if( pattern !is KoKoId) {
            lambda_ctx.assoc(((this.pattern as KoKoPattern).lista[0] as KoKoId), (lista[0] as KoKoListValue)[0])
            (0 until (pattern as KoKoPattern).lista.size - 1).forEach {
                (lista[0] as MutableList<KoKoAst>).removeAt(0)
            }
            lambda_ctx.assoc(((this.pattern as KoKoPattern).lista[1] as KoKoId), lista[0] as KoKoListValue)
        }
		val variable = this.lambda_ctx.find( KoKoId("#ALA#") ) as KoKoNullValue
		this.lambda_ctx.assoc(KoKoId(variable.value?:""), (valor[0].eval(lambda_ctx) as KoKoListValue)[0])
		if(valor.size>1){
			val lamda_Hija = this.expr.eval(lambda_ctx) as KoKoLambdaValue
			val lamda = lamda_Hija.value as KoKoLambda
			if(valor.size==1)
				return lamda.expr.eval(lambda_ctx)
			(valor as MutableList).removeAt(0)
			if(valor.size==0)
				return this.expr.eval(lambda_ctx)
			return lamda.eval(valor)
		}
		return this.expr.eval(lambda_ctx)
	}
}