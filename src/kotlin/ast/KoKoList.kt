/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

 package kokoslan.kotlin.ast

import java.util.*
import java.io.*

class KoKoList:ArrayList<KoKoAst>, KoKoAst {

	constructor(list:List<KoKoAst> = mutableListOf()){
	  list.forEach { this.add(it) }
  	}

	override fun genCode(out : PrintStream){
		if( this.size == 0 )
            out.print("[ ] ")
		else {
            out.print("[ ")
            this[0].genCode(out)
            (1 until this.size).forEach {
                out.print(", ")
                this[it].genCode(out)
            }
            out.print("] ")
        }
	}
	
	override fun eval(ctx : KoKoContext) : KoKoValue {
		val res = KoKoListValue()
		this.forEach{
			res.add(it.eval(ctx))
		}
		return res
	}
	
	fun eval() = eval(KoKoContext(KoKoContext()))
}