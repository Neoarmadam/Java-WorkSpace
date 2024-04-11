package Actividades_UT4;
/*
 * Inicializa dos variables enteras y calcula su suma, resta,
 * multiplicacion y el resto de una division entera.
 * Cambia las variables de enteras a reales y ejecuta 
 * de nuevo el programa.
 */
public class Actividad_8_1 {

	public static void main (String args[]) {
		int num1=8;
		int num2=6;
	
		//Suma
		System.out.println("La suma de los numeros es "+(num1+num2));
		//Resta
		System.out.println("La resta de los numeros es " +(num1-num2));
		//Multiplicacion
		System.out.println("La multiplicacion de los numeros es " +(num1*num2));
		//Division
		System.out.println("La division de los numeros es " +(num1/num2));
		//Resto
		System.out.println("El resto de la division anterior es " +(num1%num2));
		
		}
}
