/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.io.PrintStream

data class KoKoCons(val lista : MutableList<KoKoAst>) : KoKoAst{

    override fun genCode(out: PrintStream){}

    override fun eval(ctx : KoKoContext) : KoKoValue{
        val list = lista[0].eval(ctx)
        if(lista.size == 1) {
            return list as KoKoListValue
        }else{
            (1 until lista.size).forEach{
                val listaAux = lista[it].eval(ctx)
                (((listaAux as KoKoListValue)[0] as KoKoListValue)).forEach{
                    ((list as KoKoListValue)[0] as MutableList<KoKoValue>).add(it as KoKoNumValue)
                }
            }
        }
        return (list as KoKoListValue)[0]
    }
}