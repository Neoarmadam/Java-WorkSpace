package Actividades_UT4_PowerPoint;
	/*
	 * Pedir los numeros que desee el usuario
	 * Visualizar la media y si se ha introducido algun par
	 */
	import java.util.Scanner;
public class Actividad_31 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num1, num2, media;
		int suma=0;
		boolean par=false;
		System.out.println("Introduce el numero de numeros ha hacer la media");
		num1=sc.nextInt();
		System.out.println("Vas a introducir " +num1 +" numeros");
		for (int f=0; f<num1; f++) {
			System.out.println("Introduce un numero");
			num2=sc.nextInt();
			if (num2%2==0) {
				par=true;
			}
			suma=suma+num2;
		}
		media=suma/num1;
		System.out.println("La media de los numeros es " +media);
		System.out.println("Se han introducido pares: " +par);
	}
}
