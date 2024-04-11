package Actividades_UT4_PowerPoint;
	/*
	 * Escribe un programa que solicite una vocal y muestre de cual se trata.
	 * Para leer un caracter con la clase Scanner podemos usar instruciones.
	 */
	import java.util.Scanner;
public class Actividad_21 {
	public static void main (String args[]) {
		//Inicializamos variables
		char letra;
		String cadena = null;
		
		//Pedimos la letra
		System.out.println("Introduce una letra");
		Scanner sc= new Scanner(System.in);
		cadena=sc.nextLine();
		sc.close();
		letra=cadena.charAt(0);
		System.out.println("Has introducido " +letra);	
	}
}
