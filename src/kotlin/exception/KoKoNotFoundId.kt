/* 
Autores:
	Alejandro Calderon Acuña.
	Linsey Garro Le Roy.
	Angel Gómez Oviedo.

 */
 
package kokoslan.kotlin.ast

class KoKoNotFoundId(val id:KoKoId) : RuntimeException("*** Id '' ${id.value} not defined! ***")