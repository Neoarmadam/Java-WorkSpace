/*
 * Crea un programa en Java que solicite al usuario dos cadenas de caracteres 
 * y que devuelva la primera cadena, pero transformando en mayúsculas la parte 
 * que coincide con la segunda cadena introducida. Por ejemplo, si se introducen las cadenas 
 * “Este es mi amigo Juan” y “amigo”, devolverá “Este es mi AMIGO Juan”.
 */
package Actividades_UT6_PowerPoint;
	
public class Actividad_9 {
	public static void main (String args[]) {
		/**Variables**/
		String origen="Este es mi amigo juan, y amigo de sinfa";
		String susti="amigo";
		String result;
		
		result=origen.replaceFirst(susti,susti.toUpperCase());
		
		System.out.println(result);
	}
}
