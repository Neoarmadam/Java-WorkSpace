package Actividades_UT4_PowerPoint;
	/*
	 * Registra varias edaded, la edad 0 acaba el programa
	 * Promedio de edades ingresadas y porcentajes de mayores de 50
	 */
	import java.util.Scanner;
public class Actividad_47 {
	public static void main (String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		int edad;
		int contadorEdad=-1;
		int contadorMayores=0;
		int acumEdad=0;
		
		//Resolucion
		
		do {
			contadorEdad+=1;
			System.out.println("Introduce la edad");
			edad=sc.nextInt();
			acumEdad+=edad;
			if (edad>=50){
				contadorMayores+=1;
			}
		}while (edad>0);
		System.out.println("Promedio de edades: " +(acumEdad/contadorEdad));
		System.out.println("Porcentaje mayores: " +(100/contadorEdad*contadorMayores));
	}
}
