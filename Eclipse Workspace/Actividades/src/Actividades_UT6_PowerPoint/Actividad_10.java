/*
 * Cadena espejo.�Crea un programa que reciba una cadena de caracteres 
 * y la devuelva invertida con efecto espejo, esto es, se concatena a la palabra 
 * original su inversa, compartiendo la �ltima letra, que har� de espejo, por lo que la palabra 
 * obtenida se lee igual hacia adelante que hacia atr�s. Por ejemplo, al introducir �teclado� 
 * devolver� �tecladodalcet� �y al introducir �goma� devolver� �gomamog�
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
