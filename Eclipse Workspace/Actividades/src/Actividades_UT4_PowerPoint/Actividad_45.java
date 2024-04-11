package Actividades_UT4_PowerPoint;
	/*
	 * Dadas 6 notas
	 * mostrar aprobados, condicionales (=4) y suspensos
	 */
	import java.util.Scanner;
public class Actividad_45 {
	public static void main(String args[]) {
		//Variables
		Scanner sc=new Scanner(System.in);
		int nota;
		int aprobados=0;
		int suspensos=0;
		int condicionales=0;
		
		//Resolucion
		System.out.println("Vas a introducir las notas de tus alumnos");
		for( int f=0; f<6; f++) {
			System.out.println("Introduce la nota");
			nota=sc.nextInt();
			switch (nota) {
				case 0,1,2,3:
					suspensos=suspensos+1;
					break;
				case 4:
					condicionales=condicionales+1;
					break;
				case 5,6,7,8,9,10:
					aprobados=aprobados+1;
					break;
				default:
					System.out.println("Nota no valida, vuelva a introducirla");
					f=f-1;
					break;
			}
		}
		System.out.println("Aprobados: " +aprobados);
		System.out.println("Condicionales: " +condicionales);
		System.out.println("Suspensos :" +suspensos);
	}
}
