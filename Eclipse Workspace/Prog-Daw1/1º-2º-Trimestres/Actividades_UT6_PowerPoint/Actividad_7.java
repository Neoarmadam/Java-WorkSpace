/*
 * Programa que pida al usuario el número de veces que quiere comparar 
 * dos nombres que debe introducir también el usuario. Una vez introducidos, se deben  
 * visualizar por pantalla en orden alfabético distinguiendo entre mayúsculas y minúsculas
 */
package Actividades_UT6_PowerPoint;
	import java.util.Scanner;
public class Actividad_7 {
	public static void main (String args[]) {
		/**Variables**/
		Scanner sc=new Scanner(System.in);
		String nombre1;
		String nombre2;
		int veces;
		int valor;
		
		/**Resolucion**/
		System.out.println("Cuantas veces quieres comparar??");
		veces=sc.nextInt();
		sc.nextLine();
		for(int f=0; f<veces; f++) {
			System.out.println("Dame los nombres");
			nombre1=sc.nextLine();
			nombre2=sc.nextLine();
			valor=nombre1.compareTo(nombre2);
			System.out.println(valor);
		}
	}
}
