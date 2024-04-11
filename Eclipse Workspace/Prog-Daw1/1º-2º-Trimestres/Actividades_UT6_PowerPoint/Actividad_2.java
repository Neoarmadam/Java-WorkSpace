package Actividades_UT6_PowerPoint;
/*
 * Escribe un programa que recoja una cadena de caracteres por teclado y muestre el número de vocales que tiene.
 * Utiliza una sola comparación.
 */
	import java.util.Scanner;
public class Actividad_2 {
	public static void main(String args[]) {
		/**Variables**/
		Scanner sc=new Scanner(System.in);
		String cadena=null;
		int lim;
		int contador=0;
		
		/**Resolucion**/
		cadena=sc.nextLine();
		lim=cadena.length();
		for(int f=0; f<lim; f++) {
			switch (cadena.charAt(f)) {
			case 'a','A','e','E','i','I','o','O','u','U':
				contador++;
				break;
			default:
				break;
			}
		}
		System.out.println(contador);
	}
}
