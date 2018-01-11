/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.io.*

data class KoKoPattern(val lista : MutableList<KoKoAst> , val pipe : String) : KoKoAst{

    override fun genCode(out: PrintStream){
        out.print("[ ")
        lista[0].genCode(out)
        (1 until lista.size).forEach {
            if( it+1 == lista.size ) {
                out.print("| ")
                lista[it].genCode(out)
            }
            else {
                out.print(", ")
                lista[it].genCode(out)
            }
        }
        out.print("] ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue{
        return lista[0].eval(ctx)
    }
}