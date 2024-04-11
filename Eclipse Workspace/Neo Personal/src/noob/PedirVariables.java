package noob;
//Vamos a probar a pedir variables
import java.util.Scanner; //importamos la clase Scanner de las bibliotecas Java
public class PedirVariables {
	
	public static void main (String args []) {
	System.out.println("Por favor introduzca una cadena por teclado");
	String entradaTeclado="";
	Scanner entradaScanner = new Scanner (System.in); //Creacion de un objeto Scanner
	entradaTeclado=entradaScanner.nextLine (); //invocamos un metodo sobre un objeto Scanner
	System.out.println("Entrada recibida por teclado es \""+entradaTeclado+"\"");
	}
}
