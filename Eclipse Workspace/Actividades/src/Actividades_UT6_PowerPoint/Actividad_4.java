package Actividades_UT6_PowerPoint;
/*
 * Escribe un programa que recoja una cadena de caracteres por teclado y 
 * muestre el número de veces que aparecerá un carácter también recogido por teclado.
 */
	import java.util.Scanner;
public class Actividad_4 {
	public static void main(String args[]) {
		/**Variables**/
		Scanner sc=new Scanner(System.in);
		String cadena;
		String caracter;
		int lim;
		int contador=0;
		
		/**Resolucion**/
		cadena=sc.nextLine();
		caracter=sc.nextLine();
		lim=cadena.length();
		
		for(int f=0; f<lim; f++) {
			if(cadena.charAt(f)==caracter.charAt(0)){
				contador++;
			}
		}
		System.out.println(contador);
	}
}
