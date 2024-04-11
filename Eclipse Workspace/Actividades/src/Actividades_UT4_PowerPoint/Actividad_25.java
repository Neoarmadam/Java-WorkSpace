package Actividades_UT4_PowerPoint;
	/*
	 * Pedir numeros y mostrarlos
	 * Parar cuando den un numero par
	 * Dar mensaje de porque parar
	 */
	import java.util.Scanner;
public class Actividad_25 {
	public static void main(String args[]) {
		//Variables
		int num;
		float resto;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Te voy a pedir numeros hasta que me des un numero par");
		num=sc.nextInt();
		resto=num%2;
		while (resto!=0) {
			System.out.println(num);
			num=sc.nextInt();
			resto=num%2;
		}
		System.out.println("Introduciste un numero par");
		
	}
}
