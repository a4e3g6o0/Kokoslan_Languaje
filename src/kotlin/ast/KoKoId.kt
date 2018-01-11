/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast;

class KoKoId( value : String) : KoKoAtom<String>( value ){
	override fun eval(ctx : KoKoContext) = ctx.find(this)
}