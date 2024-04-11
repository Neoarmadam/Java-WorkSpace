package Actividades_UT6_PowerPoint;
/*
 * Crear una cadena de caracteres e imprimir todos los caracteres que la componen. Hay que utilizar el método charAt.
 */
public class Actividad_1 {
	public static void main (String args[]) {
		/**Variables**/
		String cadena="Hoy es martes 17";
		final int LIM=cadena.length();
		
		/**Resolucion**/
		for(int f=0; f<LIM; f++) {
			System.out.print(cadena.charAt(f));
		}
	}
}
