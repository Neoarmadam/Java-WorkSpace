package Actividades_UT4_PowerPoint;
	/*
	 * Pedir las notas de 10 alumnos
	 * Mostrar las notas
	 * Solo se pueden poner notas del 0 al 10
	 */
	import java.util.Scanner;
public class Actividad_32 {
	public static void main(String args []) {
		Scanner sc= new Scanner(System.in);
		int notas, aprobados=0, LIM=10;
		
		System.out.println("Vas a introducir las notas de tus alumnos y vamos a comprobar cuentos aprueban");
		for (int f=0; f<LIM; f++) {
			System.out.println("Introduce la nota");
			notas=sc.nextInt();
			while (notas<0 || notas>10) {
				System.out.println("Nota no valida, introduce otra");
				notas=sc.nextInt();
			}
			if (notas>=5) {
				aprobados=aprobados+1;
			}
		}
		sc.close();
		System.out.println("Han aprobado " +aprobados +" alumnos");
	}
}
