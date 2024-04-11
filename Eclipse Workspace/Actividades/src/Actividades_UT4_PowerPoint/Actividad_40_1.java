package Actividades_UT4_PowerPoint;
	/*
	 * Adivinar Numero juego
	 * Pedir un numero ha adivinar
	 * Indicar si al intentar adivinar el intento es mayor o igual al numero 
	 */
	import java.util.Scanner;
public class Actividad_40_1 {
	public static void main(String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Introduce el numero que tu amigo intentara adivinar");
		num1=sc.nextInt();
		
		System.out.println("Intenta adivinar el numero");
		num2=sc.nextInt();
		while (num2!=num1) {
			if (num2<num1) {
				System.out.println("El numero introducido es menor");
			}else {
				System.out.println("El numero introducido es mayor");
			}
			System.out.println("Vuelve a intentarlo");
			num2=sc.nextInt();
		}
		System.out.println("Acertaste");
	}
}
