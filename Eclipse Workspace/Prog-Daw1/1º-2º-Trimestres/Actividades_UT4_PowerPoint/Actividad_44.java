package Actividades_UT4_PowerPoint;
	/*
	 * Dar las tablas de multiplicar de1 1 al 10 de la forma mas simple posible
	 */
	import java.util.Scanner;
public class Actividad_44 {
		public static void main (String args[]) {
			//Variables
			Scanner sc= new Scanner(System.in);
			int multiplo=1;
			int multiplicacion;
			
			//Resolucion
			for(int f1=0; f1<10; f1++) {
				System.out.println("Tabla del " +multiplo);
				System.out.println("-----------");
				multiplicacion=1;
				for (int f2=0; f2<10; f2++) {
					System.out.println(multiplo +" x " +multiplicacion +" = " +(multiplo*multiplicacion));
					multiplicacion=multiplicacion+1;
				}
				multiplo=multiplo+1;
			}
		}

}
