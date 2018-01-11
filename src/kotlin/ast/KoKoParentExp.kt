/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.io.*

data class KoKoParentExp(val expression : KoKoAst) : KoKoAst{

    override fun genCode(out: PrintStream){
        out.print("( ")
        this.expression.genCode(out)
        out.print(") ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue{
        return expression.eval(ctx)
    }
}