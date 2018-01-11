/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.io.*

data class KoKoInsertListPat(val lista: MutableList<KoKoAst>) : KoKoAst{

    override fun genCode(out: PrintStream){
        out.print("[")
        this.lista[0].genCode(out)
        out.print("| ")
        this.lista[1].genCode(out)
        out.print("] ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue{
        val list = lista[1].eval(ctx)
        val valor = lista[0].eval(ctx)
        (list as MutableList<KoKoValue>).add(0,valor)
        return list as KoKoListValue
    }
}