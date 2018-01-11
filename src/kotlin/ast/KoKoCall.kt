/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.util.*
import java.io.*

data class KoKoCall(val head:KoKoAst, val args:KoKoCallArgs = KoKoCallArgs()) : KoKoAst{
	
	override fun genCode(out: PrintStream){
		head.genCode(out)
		args.genCode(out)

		if( args.size == 0 )
			out.print("( )")
	}
	
	override fun eval(ctx : KoKoContext) : KoKoValue{

		when(head.toString()){
			"print" -> {
                val print = KoKoPrint( args[0] )
                return print.eval(ctx)
			}
			"first" -> {
				val first = KoKoFirst( args[0] as MutableList<KoKoAst>)
				return first.eval(ctx)
			}
            "rest" -> {
                val rest = KoKoRest( args[0] as MutableList<KoKoAst>)
                return rest.eval(ctx)
            }
			"cons" -> {
				val cons = KoKoCons( args as MutableList<KoKoAst> )
				return cons.eval(ctx)
			}
            "fail" -> {
                val fail = KoKoFail()
                return fail.eval(ctx)
            }
			else -> {
                val lambda_ast = ctx.find(KoKoId(head.toString())) as KoKoLambdaValue
                val lambda = lambda_ast.value as KoKoLambda
                return lambda.eval(args)
			}
		}
	}
}