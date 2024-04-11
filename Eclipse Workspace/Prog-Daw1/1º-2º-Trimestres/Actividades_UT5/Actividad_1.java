package Actividades_UT5;
	/*
	 * Escribe un programa que pida al usuario 4 números enteros y los almacene en un vector.
	 * Después, debes mostrar esos números por pantalla.
	 */
	import java.util.Scanner;
public class Actividad_1 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		final int TAMVEC=4;
		int [] vector= new int[TAMVEC];
		
		System.out.println("Te voy a pedir 4 numeros, introducelos");
		for (int f=0; f<TAMVEC; f++) {
			vector[f]=sc.nextInt();
		}
		
		System.out.println("Has introducido los siguientes numeros");
		for(int f=0; f<TAMVEC; f++) {
			System.out.println(vector[f]);
		}
	}
}
