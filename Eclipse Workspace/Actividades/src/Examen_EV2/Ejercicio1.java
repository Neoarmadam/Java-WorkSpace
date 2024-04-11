package Examen_EV2;
	import java.util.Scanner;
public class Ejercicio1 {
	public static void main (String args[]) {
		//Variables
		Scanner sc=new Scanner (System.in);
		String cadena; //Como se llama en el ejercicio
		char caracter; //Como se llama en el ejercicio
		int numApariciones;
		
		//Resolucion del Main
		//cadena=pedirCadena();
		//caracter=pedirCaracter();
		cadena="ffaahh";
		caracter='a';
		buscarCaracter(cadena, caracter);
	}
	
	//Metodo para pedir el String cadena
	public static String pedirCadena() {
		//Variables del metodo
		Scanner sc=new Scanner(System.in);
		String cadena;
		
		//Resolucion del metodo
		System.out.println("Introduce la cadena de caracteres");
		cadena=sc.nextLine();
		return cadena;
	}
	
	//Metodo para pedir la Char caracter
	public static char pedirCaracter() {
		//Variables del metodo
		Scanner sc=new Scanner(System.in);
		char caracter;
		
		//Resolucion del metodo
		System.out.println("Introduce el caracter");
		caracter=sc.next().charAt(0);
		return caracter;
	}
	
	//Metodo para contar cuantas veces aparece el caracter en la cadena
	public static int buscarCaracter(String cadena, char caracter) {
		//Variables del metodo
		int numApariciones=0;
		final int LIM= cadena.length();
		int posicion=0;
		//Resolucion del metodo
		
		while(posicion<LIM) {
			posicion=cadena.indexOf(caracter , posicion);
			System.out.println(posicion);
			posicion++;
		}
		
		return numApariciones;
	}
	
	
}
