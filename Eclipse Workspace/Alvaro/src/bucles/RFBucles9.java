package bucles;

import java.util.Scanner;

public class RFBucles9 {

	public static void main(String[] args) {
		
		/*
		 * Presentar en consola una tabla de multiplicar del número que se pide por teclado. Debe lucir asi:
		 * 
		 * Tabla del 1
		 * -------------
		 * 1x1 = 1
		 * 1x2 = 2
		 * 1x3 = 3
		 * 1x4 = 4
		 * 1x5 = 5
		 * 1x6 = 6
		 * 1x7 = 7
		 * 1x8 = 8
		 * 1x9 = 9
		 * 1x10 = 10
		 * 
		*/
		
		// Definición de variables e inicialización del escáner
		int num=1;
		
		Scanner teclado = new Scanner(System.in);
		
		// Pedimos el número del que queremos sacar la tabla de multiplicar
		System.out.println("Introduce un número y te muestro su tabla de multiplicar");
		num = teclado.nextInt();
		
		// Le damos diseño a la tabla
		System.out.println();
		System.out.println("Tabla del " +num);
		System.out.println("--------------");
		
		// Bucle for que nos muestra la tabla de multiplicar hasta el 10 del número introducido
		for(int i = 1; i <= 10; i++) {
			System.out.println(+num+ " * " +i+ " = " +num * +i);
		}
		
		// Cerramos el teclado
		teclado.close();

	}

}
