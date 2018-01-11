/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

import java.io.*

data class KoKoLet( val id : KoKoAst, val expr : KoKoAst ) : KoKoAst{
 
   override fun genCode(out : PrintStream){
      out.print("let ")
	  this.id.genCode(out)
	  out.print("= ")
	  this.expr.genCode(out)
	  out.println()
   }
   
   override fun eval(ctx:KoKoContext) : KoKoValue{
	   val valor = expr.eval(ctx)
	   ctx.assoc(id as KoKoId, valor)
	   return valor
   }
}