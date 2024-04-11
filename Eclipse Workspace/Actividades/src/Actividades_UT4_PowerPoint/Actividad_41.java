package Actividades_UT4_PowerPoint;
	/*
	 * Pedir N sueldos y mostrar el mayor
	 */
	import java.util.Scanner;
public class Actividad_41 {
	public static void main(String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		int sueldoMayor=0, sueldoEntrada;
		int lim;
		
		System.out.println("Introduce cuantos sueldos vas a introducir");
		lim=sc.nextInt();
		
		for (int f=0; f<lim; f++) {
			System.out.println("Introduce el " +(f+1) +" sueldo");
			sueldoEntrada=sc.nextInt();
			if (sueldoEntrada>sueldoMayor) {
				sueldoMayor=sueldoEntrada;
			}
		}
		System.out.println("El mayor sueldo es " +sueldoMayor);
	}
}
