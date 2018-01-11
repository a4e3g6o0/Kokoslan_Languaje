/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.util.*
import java.io.*

data class KoKoEvalCondition(var condition:KoKoAst, val test:KoKoAst?) : KoKoAst{
	
	override fun genCode(out: PrintStream){
		this.condition.genCode(out)
		if (test != null)
			test.genCode(out)
	}
	
	override fun eval(ctx : KoKoContext) : KoKoValue{
		return if(test != null) 
					(test as KoKoTestExpression).evaluation((condition.eval(ctx) as KoKoBoolValue).value,ctx)
						else condition.eval(ctx)
		
	}
}