package Actividades_UT4_PowerPoint;
	/*
	 * Escribe un programa que pida dos n�meros con el fin de visualizar la suma de todos
	 * los n�meros que hay entre ambos n�meros (incluidos dichos n�meros).
	 * Si el primer n�mero que inserte el usuario es mayor que el segundo,
	 * se volver�n a pedir otros dos �meros hasta que el primer n�mero insertado
	 * sea menor o igual que el segundo
	 */
	import java.util.Scanner;
public class Actividad_53 {
	public static void main (String args[]) {
		//Variables
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		int suma=0;
		
		do {
			System.out.println("Dame un numero");
			num1=sc.nextInt();
			System.out.println("Dame el segundo numero");
			num2=sc.nextInt();
			if (num1>num2){
				System.out.println("Error, el primer numero debe ser inferior al segundo");
			}
		}while(num1>num2);
		suma=num1+num2;
		for (int f=0; f<(num2-num1); f++) {
			num1=num1+1;	
			suma=suma+num1;
			System.out.println(suma);
		}
		System.out.println(suma);
	}
}
