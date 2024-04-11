package Actividades_UT4_PowerPoint;
	//Edita la actividad anterior para que muestre el 5
	import java.util.Scanner;
public class Actividad_36 {
public static void main(String args[]) {
		
		//Declaracion de Variables
		Scanner sc= new Scanner(System.in);
		int num=0; //Le he dado a num el valor "0" para entrar en el bucle
		
		//Explicamos al usuario lo que va ha hacer el programa
		System.out.println("Te voy a pedir una serie de numeros");
		System.out.println("y mostrare los multiplos de 5");
		
		//El proceso para dar los multiplos de 5 excluyendo el 5
		while (num!=5) {
			System.out.println("Introduce un numero");
			num=sc.nextInt();
			if (num%5==0) { //He cambiado el if de sitio, poniendolo al final
				System.out.println("El siguiente numero es multiplo de 5: " +num);
				}
		}
		System.out.println("Has introducido 5, fin del programa");
	}
}
