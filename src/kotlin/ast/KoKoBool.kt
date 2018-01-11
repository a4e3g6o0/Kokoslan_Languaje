/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

class KoKoBool( value : Boolean ) : KoKoAtom<Boolean>( value ){
	override fun eval(ctx : KoKoContext) : KoKoValue {
		return KoKoBoolValue(value)
	}
}