/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */

package kokoslan.kotlin.ast

import java.io.*

data class KoKoEvalParentCondition(val condition:KoKoAst, val test:KoKoAst?) : KoKoAst{

    override fun genCode(out: PrintStream){
        out.print("( ")
        this.condition.genCode(out)
        out.print(") ")
        if (test != null)
            test.genCode(out)
    }

    override fun eval(ctx : KoKoContext) : KoKoValue{
        return if(test != null)
            (test as KoKoTestExpression).evaluation((condition.eval(ctx) as KoKoBoolValue).value,ctx)
        else condition.eval(ctx)

    }
}