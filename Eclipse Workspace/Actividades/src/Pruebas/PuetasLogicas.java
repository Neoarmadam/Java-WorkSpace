package Pruebas;
	import java.util.Scanner;
public class PuetasLogicas {
	public static void main (String args[]) {
		//Inicializamos variables
		int num1, num2, num3;
		
		//Aqui pedimos las variables por Scanner
		Scanner teclado= new Scanner(System.in);
		System.out.println("Te voy a pedir tres numeros");
		System.out.println("Dame el primero");
		num1=teclado.nextInt();
		System.out.println("Ahora dame el segundo");
		num2=teclado.nextInt();
		System.out.println("Y ahora dame el ultimo numero");
		num3=teclado.nextInt();
		teclado.close();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("Pequeño =" +num1);
		}else if ( num2 < num3) {
				System.out.println("Pequeño =" +num2);
			}else {
				System.out.println("Pequeño =" +num3);
			}
	}
}
