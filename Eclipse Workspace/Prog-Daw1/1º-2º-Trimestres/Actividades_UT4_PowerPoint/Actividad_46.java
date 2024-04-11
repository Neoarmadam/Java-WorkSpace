package Actividades_UT4_PowerPoint;
	/*
	 * Pedir 10 numeros y mostrar si se ha introducido algun numero superior a 8
	 */
	import java.util.Scanner;
public class Actividad_46 {
	public static void main (String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		int contmayor=0;
		final int LIM=10;
		int num;
		//Resolucion
		for (int f=0; f<LIM; f++) {
			System.out.println("Introduce un numero");
			num=sc.nextInt();
			if (num>8) {
				contmayor=contmayor+1;
			}
		}
		System.out.println("Se han introducido " +contmayor +" numeros mayores que 8");
	}

}
