/*
 * Encuentra cadena.�Dise�a un programa en Java que solicite al usuario 
 * una cadena en la que buscar� y otra que ser� la cadena buscada. El programa 
 * indicar� cuantas veces aparece la segunda cadena en la primera.
 */
package Actividades_UT6_PowerPoint;
	import java.util.Scanner;
public class Actividad_8 {
	public static void main (String args[]) {
		/**Variables**/
		Scanner sc=new Scanner(System.in);
		String cadena1;
		String cadena2;
		int posicion=0;
		int contador=0;
		
		/**Resolucion**/
		cadena1=sc.nextLine();
		cadena2=sc.nextLine();
		while(posicion!=-1) {
			posicion=cadena1.indexOf(cadena2 ,posicion);
			if(posicion!=-1) {
				posicion++;
				contador++;
			}
		}
		System.out.println(contador);
	}
}
