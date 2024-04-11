package Actividades_UT4_PowerPoint;
	/*
	 * Pedir 10 numeros y decir si alguno era negativo
	 */
	import java.util.Scanner;
public class Actividad_39 {
	public static void main(String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		boolean negativos=false;
		int num;
	
		System.out.println("Te voy a pedir 10 numeros");
		for (int f=0; f<10; f++) {
			System.out.println("Introduce un numero");
			num=sc.nextInt();
			if (num<0) {
				negativos=true;
			}
		}
		if (negativos==false) {
			System.out.println("No se ha introducido ningun negativo");
		}else {
			System.out.print("Se han introducido negativos");
		}
	}
}
