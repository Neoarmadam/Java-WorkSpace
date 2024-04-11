package Actividades_UT4_PowerPoint;
	/*
	 * Calcular salario semanal de empleados.
	 *  Se les paga 15 euros por hora si no superan 35 horas
	 *  Cada hora superior a 35 se pagara por 22
	 *  Pedir horas de trabajo y devolver salariao a pagar
	 *  Pedir al usuario si desea reiniciar el programa
	 */
	import java.util.Scanner;
public class Actividad_38 {
	public static void main (String args[]) {
		//Declaracion de variables
		Scanner sc= new Scanner(System.in);
		boolean reiniciar=true;
		int horas;
		int opcion;
		int salario=0;
		int lim1;
		
		System.out.println("Este programa sirve para calcular cuanto hay que pagar semanalmente a un trabajador");
		while (reiniciar==true) { //introducimos todo en un While para poder reiniciar el programa
			System.out.println("Introduce las horas semanales ha calcular");
			horas=sc.nextInt();
			if (horas<=35){
				for (int f1=0; f1<horas; f1++) {
					salario=salario+15;
			}
			
			}
			if (horas>35) {
				salario=salario*35;
				for (int f2=35; f2<horas; f2++) {
					salario=salario+22;
				}
			}
			System.out.println("Hay que pagarle " +salario +" Euros");
			System.out.println("Quieres seguir con el programa");
			System.out.println("1=si");
			System.out.println("2=no");
			opcion=sc.nextInt();
			if (opcion==2) {
				reiniciar=false;
			}
			
		}
	}
}
