package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_9 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		
		do {
			num1=sc.nextInt();
			num2=sc.nextInt();
			if (num1>num2) {
				System.out.println("Error, el primer numero debe ser el menor");
			}
		}while(num1>num2);
		
		comprendidos(num2, num1);
	}
	
	static void comprendidos(int mayor, int menor ) {
		int contador=1;
		for(int f=menor;f<mayor-1;f++) {
			System.out.println(menor+contador);
			contador++;
		}
	}
}
