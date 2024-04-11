package Actividades_UT4_PowerPoint;
	/*
	 * Programa que pida dos numeros enteros, y luego el usuario indica que hacer. 
	 */
	import java.util.Scanner;
public class Actividad_22 {
	public static void main(String args[]) {
		//Inicializamos variables
		int num1,num2; 
		char operacion;
		
		//Pedimos las variables numeros y operacion por teclado
		Scanner sc= new Scanner(System.in);
		System.out.println("Dame un numero");
		num1=sc.nextInt();
		System.out.println("Dame otro numero");
		num2=sc.nextInt();
		System.out.println("Ahora seleciona el tipo de operacion");
		System.out.println("* para multiplicar");
		System.out.println("+ para sumar");
		System.out.println("- para restar");
		System.out.println("% o / para el cociente y el resto de la division");
		operacion=sc.next().charAt(0);
		sc.close();
		
		//Ahora hacemos las operaciones segun la opcion elegida
		switch(operacion) {
			case '*':
				System.out.println("La multiplicacion es " +(num1*num2));
				break;
			case '+':
				System.out.println("La suma es " +(num1+num2));
				break;
			case '-':
				System.out.println("La resta es " +(num1-num2));
				break;
			case '%','/':
				System.out.println("La division es " +(num1/num2) +" y el resto es " +(num1%num2));
				break;
			default:
				System.out.println("La operacion introducida no es valida");
				break;
		}
	}
}
