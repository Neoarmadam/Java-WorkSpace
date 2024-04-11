package Actividades_UT4_PowerPoint;
	/*
	 * Lee numeros asta introducir 0
	 * Contar numeros positivos y negativos insertados, y numeros total, incluyendo 0.
	 */
	import java.util.Scanner;
public class Actividad_27 {
	public static void main(String args []) {
		//Variables
		int num,contador,contadorP, contadorN, suma;
		num=1;
		suma=0;
		contador=0;
		contadorP=0;
		contadorN=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Vamos a introducir numeros para sumarlos");
		
		while (num<0 || num>0) {
			contador=contador+1;
			System.out.println("Instroduce el numero " +contador +" para sumar");
			num=sc.nextInt();
			if(num<0) {
				contadorN=contadorN+1;
			}
			if(num>0) { //Supongo que cero cuenta como positivo
				contadorP=contadorP+1;
			}
			suma=suma+num;
		}
		
		System.out.println("La suma de todos esos numeros es " +suma);
		System.out.println("Has introducido " +contador +" numeros ");
		System.out.println("Has introducido " +contadorP +" numeros positivos");
		System.out.println("Has introducido " +contadorN +" numeros negativos");
	}
}
