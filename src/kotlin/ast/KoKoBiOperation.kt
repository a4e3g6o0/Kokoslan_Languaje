/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.util.*
import java.io.*

open class KoKoBiOperation(operator:KoKoAst, left:KoKoAst, right:KoKoAst):KoKoOperation(operator, Arrays.asList(left, right)) {
	
	fun left() = this.operands[0]
  
	fun right() = this.operands[1]
  
	override fun eval(ctx:KoKoContext):KoKoValue {
		try {
			val operId = operator as KoKoId
			val lv = (left().eval(ctx))
			val rv = (right().eval(ctx))
			when ("${lv.javaClass}"){
				"class kokoslan.kotlin.ast.KoKoListValue" -> {
                    when (operId.value) {
                        "==" -> return KoKoBoolValue((lv as KoKoListValue) == (rv as KoKoListValue))
                        else -> throw KoKoEvalException("KoKoBiOperation: unimpemented operator")
                    }
				}
			}

			when (operId.value) {
				"+" -> return KoKoNumValue((lv as KoKoNumValue).value + (rv as KoKoNumValue).value)
				"-" -> return KoKoNumValue((lv as KoKoNumValue).value - (rv as KoKoNumValue).value)
				"*" -> return KoKoNumValue((lv as KoKoNumValue).value * (rv as KoKoNumValue).value)
				"/" -> return KoKoNumValue((lv as KoKoNumValue).value / (rv as KoKoNumValue).value)
				">" -> return KoKoBoolValue((lv as KoKoNumValue).value > (rv as KoKoNumValue).value)
				"==" -> return KoKoBoolValue((lv as KoKoNumValue).value == (rv as KoKoNumValue).value)
				"||" -> return KoKoBoolValue((lv as KoKoBoolValue).value || (rv as KoKoBoolValue).value)
				"&&" -> return KoKoBoolValue((lv as KoKoBoolValue).value && (rv as KoKoBoolValue).value)
				else -> throw KoKoEvalException("KoKoBiOperation: unimpemented operator")
			}
		}
		catch (e:Exception) {
			throw KoKoEvalException("${e.message}")
		}
	}
}