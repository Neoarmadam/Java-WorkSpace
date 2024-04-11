package Actividades;
	/*
	 * Pedir 3 numeros, y averiguar si alguno de los 3
	 * es la suma de los otros 2 numeros
	 */
	import java.util.Scanner;
public class NeoRataCalSum {
	public static void main (String args []) {
		//Inicializamos variables
		int num1, num2, num3, suma1, suma2, suma3;
		
		//Pedimos las variables por teclado
		Scanner sc= new Scanner(System.in);
		System.out.println("Te vamos a pedir 3 numeros");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		sc.close();
		
		//Calculamos las sumas posibles para facilitar la programacion
		suma1=num1+num2;
		suma2=num1+num3;
		suma3=num2+num3;
		
		//Comprobamos si alguno de los numeros es la suma de los otros 2
		if(suma1==num3){
			System.out.println("El numero "+num3 +" es la suma de "+num1 +" y " +num2);
		}else if (suma2==num2) {
				System.out.println("El numero " +num2 +" es la suma de " +num1 +" y " +num3);
		}else if (suma3==num1) {
					System.out.println("El numero " +num1 +" es la suma de " +num2 +" y " +num3);
		}else {
					System.out.println("Ninguno de los numeros introducidos es la suma de los otros 2");
		}
	}
}
	

