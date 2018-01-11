/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.io.*

open class KoKoAtomValue<T>(val value:T):KoKoValue {
	override fun toString() = this.value.toString()
}