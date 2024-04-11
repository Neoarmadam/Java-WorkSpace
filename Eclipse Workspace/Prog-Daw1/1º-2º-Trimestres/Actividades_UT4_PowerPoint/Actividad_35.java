package Actividades_UT4_PowerPoint;
	/*
	 * Pedir una serie de numeros ys mostrar los multiplos
	 * de 5 a excepcion de 5, hacerlo de la forma mas simple
	 * posible
	 */
	import java.util.Scanner;
public class Actividad_35 {
	public static void main(String args[]) {
		
		//Declaracion de Variables
		Scanner sc= new Scanner(System.in);
		int num;
		
		//Explicamos al usuario lo que va ha hacer el programa
		System.out.println("Te voy a pedir una serie de numeros");
		System.out.println("y mostrare los multiplos de 5");
		System.out.println("a excepcion del 5");
		
		//El proceso para dar los multiplos de 5 excluyendo el 5
		num=sc.nextInt();
		while (num!=5) {
			if (num%5==0) {
			System.out.println("El siguiente numero es multiplo de 5: " +num);
			}
			System.out.println("Introduce un numero");
			num=sc.nextInt();
		}
		System.out.println("Has introducido 5, fin del programa");
	}
}
