package Actividades_UT4_PowerPoint;
	/*
	 * Pedir 5 calificaciones
	 * Decir al final cuantos suspensos
	 * Validar que el usuario introduzca notas validad
	 */
	import java.util.Scanner;
public class Actividad_42 {
	public static void main(String args[]) {
		//Variables
		Scanner sc= new Scanner (System.in);
		int nota;
		int suspensos=0;
		
		System.out.println("Vas a introducir 5 notas y te dire cuantos han suspendido");
		
		for(int f=0; f<5; f++) {
			System.out.println("Introduce la " +(f+1) +" nota");
			nota=sc.nextInt();
			while (nota<0 || nota>10) {
				System.out.println("Nota no valida, introduzcala otra vez");
				nota=sc.nextInt();
			}
			if (nota<5) {
				suspensos=suspensos+1;
			}
		}
		System.out.println("Han suspendido " +suspensos +" alumnos");
	}

}
