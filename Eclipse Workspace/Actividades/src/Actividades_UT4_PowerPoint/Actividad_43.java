package Actividades_UT4_PowerPoint;
	/*
	 * Dibujar un cuadrado
	 */
	import java.util.Scanner;
public class Actividad_43 {
	public static void main (String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		int lado;
		
		System.out.println("Introduce el lado del cuadrado");
		lado=sc.nextInt();
		
		for (int f1=0; f1<lado; f1++) {
			for (int f2=0; f2<lado; f2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
