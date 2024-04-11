/*
 * Cadena espejo. Crea un programa que reciba una cadena de caracteres 
 * y la devuelva invertida con efecto espejo, esto es, se concatena a la palabra 
 * original su inversa, compartiendo la última letra, que hará de espejo, por lo que la palabra 
 * obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir “teclado” 
 * devolverá “tecladodalcet”  y al introducir “goma” devolverá “gomamog”
 */
package Actividades_UT6_PowerPoint;

public class Actividad_10 {
	public static void main(String args[]) {
		String cadena="hola"; //holaloh
		int lim;
		
		
		lim=cadena.length();
		System.out.print(cadena);
		for (int f=1; f<lim; f++) {
			System.out.print(cadena.charAt(lim-f-1));
		}
		
	}

}
