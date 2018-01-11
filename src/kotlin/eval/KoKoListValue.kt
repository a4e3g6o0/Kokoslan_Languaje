/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.util.*
import java.io.*

class KoKoListValue(var list:MutableList<KoKoValue> = mutableListOf()):ArrayList<KoKoValue>(list), KoKoValue