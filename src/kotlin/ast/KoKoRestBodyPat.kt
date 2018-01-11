/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.io.*

data class KoKoRestBodyPat(val id : KoKoAst) : KoKoAst{

    override fun genCode(out: PrintStream){
        out.print("| ")
        out.print("] ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue{
        return id.eval(ctx)
    }
}