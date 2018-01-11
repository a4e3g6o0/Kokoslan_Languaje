/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.util.*
import java.io.*

class KoKoMAYOR(operator : KoKoAst, left : KoKoAst, right : KoKoAst ) : KoKoBiOperation(operator, left, right) {
	
	override fun eval(ctx: KoKoContext): KoKoValue{
	   try {
		     val lv = (left().eval(ctx)) as KoKoNumValue
			 val rv = (right().eval(ctx)) as KoKoNumValue
	         return KoKoBoolValue( lv.value > rv.value )
	   } catch ( e : Exception ) {
			throw KoKoEvalException("${e.message}")
	   }
   }
}