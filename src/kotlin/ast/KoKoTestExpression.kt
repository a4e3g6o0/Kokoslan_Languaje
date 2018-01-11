/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.util.*
import java.io.*

data class KoKoTestExpression(val exp_true:KoKoAst, val exp_false:KoKoAst) : KoKoAst{
	
	override fun genCode(out: PrintStream){
		out.print("? ")
		this.exp_true.genCode(out)
		out.print(": ")
		this.exp_false.genCode(out)
	}
	
	override fun eval(ctx : KoKoContext) : KoKoValue{
		return exp_true.eval(ctx)
	}
	
	fun evaluation(condicion : Boolean , ctx : KoKoContext) = if(condicion) exp_true.eval(ctx) else exp_false.eval(ctx)
}