/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.io.PrintStream

data class KoKoLambdaLlaves(val lista: MutableList<KoKoAst>) : KoKoAst{

    override fun genCode(out: PrintStream){
        out.print("{ \n\t\t")
        this.lista[0].genCode(out)
        out.print("-> ")
        this.lista[1].genCode(out)
        out.print("\n\t\t ")

        if(lista.size > 2)
            ( 2 until lista.size step 2 ).forEach {
                out.print("| ")
                this.lista[it].genCode(out)
                out.print("-> ")
                this.lista[it + 1].genCode(out)
                if(it+2 != lista.size)
                    out.print("\n\t\t ")
                else
                    out.print("\n ")
            }
        out.print("} ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue {
        val list = lista[1].eval(ctx)
        return list
    }
}