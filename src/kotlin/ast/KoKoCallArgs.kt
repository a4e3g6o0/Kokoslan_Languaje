/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
 package kokoslan.kotlin.ast

import java.util.*
import java.io.*

class KoKoCallArgs: ArrayList<KoKoAst>, KoKoAst {

	constructor(variables:MutableList<KoKoAst> = mutableListOf()){
		variables.forEach {
			this.add(it) }
	}

	override fun genCode(out : PrintStream){
		this.forEach {
            out.print("( ")
			((it as KoKoList)[0]).genCode(out)
            out.print(") ")
        }
	}
	
	override fun eval(ctx : KoKoContext) : KoKoValue {
		val res = KoKoListValue()
		this.forEach{
			res.add(it.eval(ctx))
		}
		return res
	}
}