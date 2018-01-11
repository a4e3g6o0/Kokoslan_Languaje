/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
 package kokoslan.kotlin.ast

import java.util.*
import java.io.*

data class KoKoPrint( val expression:KoKoAst ):KoKoAst {
	
	override fun genCode(out : PrintStream){}
	
	override fun eval(ctx : KoKoContext) : KoKoValue {
		return (expression.eval(ctx) as KoKoListValue)[0]
	}
}