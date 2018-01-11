/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

class KoKoNum(value : Double) : KoKoAtom<Double>(value){
   override fun eval(ctx : KoKoContext) = KoKoNumValue(value)
}