package kokoslan.kotlin.ast

import java.io.PrintStream

data class KoKoRest(val lista : MutableList<KoKoAst>) : KoKoAst{

    override fun genCode(out: PrintStream){}

    override fun eval(ctx : KoKoContext) : KoKoValue {
        val list = lista[0].eval(ctx)
        val listAux: MutableList<KoKoValue> = mutableListOf()
        (1 until (list as KoKoListValue).size).forEach {
            (listAux).add(list[it])
        }
        return KoKoListValue(listAux)
    }
}