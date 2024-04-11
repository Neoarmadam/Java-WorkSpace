/*
 * Programa que pida al usuario el número de veces que quiere comparar dos cadenas que debe 
 * introducir también el usuario. Una vez introducidas, debe imprimir por pantalla si son iguales o no.
 *  Hay que utilizar el método equals().
 */
package Actividades_UT6_PowerPoint;
	import java.util.Scanner;
public class Actividad_6 {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		String cadena1=null;
		String cadena2=null;
		int repeticiones;
		
		System.out.println("Cuantas veces vas a comparar??");
		repeticiones=sc.nextInt();
		sc.nextLine(); //Limpiar el scanner
		for(int f=0; f<repeticiones; f++) {
			System.out.println("Dame las 2 cadenas");
			cadena1=sc.nextLine();
			System.out.println("dame la otra");
			cadena2=sc.nextLine();
			if (cadena1.equals(cadena2)) {
				System.out.println("Son iguales");
			}else {
				System.out.println("No son iguales");
			}
		}
	}
}
