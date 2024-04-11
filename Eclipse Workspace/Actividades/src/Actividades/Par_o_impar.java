package Actividades;
	import java.util.Scanner;
	//Saber si un numero es par o impar
public class Par_o_impar {
	public static void main(String args[]) {
		int num,resto;
		
		System.out.println("Dame un numero");
		Scanner teclado= new Scanner (System.in);
		num=teclado.nextInt();
		resto=num%2;
		if(num<0) {
			System.out.println("Es menor de 0");
		}else {
			if(num==0) {
				System.out.println("Es igual a 0");
			}else {
				System.out.println("Es mayor de 0");
			}
		}
		if(resto==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		System.out.println("Encantado, adios");
		teclado.close();
	}
}
