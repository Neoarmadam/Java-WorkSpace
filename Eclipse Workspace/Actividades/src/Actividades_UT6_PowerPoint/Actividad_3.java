package Actividades_UT6_PowerPoint;
/*
 * Dada una cadena invertir la misma y mostrar por pantalla. 
 */
	import java.util.Scanner;
public class Actividad_3 {
	public static void main (String args[]) {
		/**Variables**/
		Scanner sc=new Scanner(System.in);
		String cadena="Martes 17 de Febrero";
		final int LIM=cadena.length();
		
		/**Resolucion**/
		for(int f=0; f<LIM; f++) {
			System.out.print(cadena.charAt(LIM-1-f));
		}
	}

}
