/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.io.PrintStream

class KoKoFail : KoKoAst{

    override fun genCode(out: PrintStream){
        out.print("( )")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue {
        return KoKoStringValue("FAIL")
    }
}