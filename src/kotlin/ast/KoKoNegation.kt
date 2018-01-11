/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.util.*
import java.io.*

data class KoKoNegation(val cantidad: Int ,val condition:KoKoAst) : KoKoAst{
	
	override fun genCode(out: PrintStream){
		(0 until cantidad).forEach{
			out.print("!")
		}
		this.condition.genCode(out)
	}
	
	override fun eval(ctx : KoKoContext) : KoKoValue{
		var valor = (condition.eval(ctx) as KoKoBoolValue).value
		(0 until cantidad).forEach{
			valor = !valor 
		}
		return KoKoBoolValue(valor)
	}
}