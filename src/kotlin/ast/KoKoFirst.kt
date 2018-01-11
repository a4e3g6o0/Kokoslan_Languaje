/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.io.PrintStream

data class KoKoFirst(val lista : MutableList<KoKoAst>) : KoKoAst{

    override fun genCode(out: PrintStream){}

    override fun eval(ctx : KoKoContext) : KoKoValue{
        val list = lista[0].eval(ctx)
        return KoKoListValue(mutableListOf((list as KoKoListValue)[0]))
    }
}