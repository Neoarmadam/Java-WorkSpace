package Actividades_UT4_PowerPoint;
	/*
	 * Pedir un numero
	 * Visualizar la suma de todos los numeros impares desde 1 asta este numero(incluyendolo)
	 * El numero debe ser positivo
	 */
	import java.util.Scanner;
public class Actividad_50 {
	public static void main (String args[]) {
		//Variables
		Scanner sc = new Scanner(System.in);
		int num, suma=0, impares=1;
		
		System.out.println("Dame un numero");
		num=sc.nextInt();
		
		while (num<0) {
			System.out.println("Numero no valido, introduce otro");
			num=sc.nextInt();
		}
		
		for(int f=0; f<num; f=f+2) {
			suma+=impares;
			System.out.println(suma);
			impares+=2;
		}
	}

}
