package listas;

import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tamaño;
		float media=0;
		
		System.out.println("Dime cuantos numeros vas a darme");
		tamaño=sc.nextInt();
		
		int[] num=new int [tamaño];
		int[] carlos=new int [tamaño];
		
		System.out.println("El tamaño del array es :"+num.length);
		
		pedirLista(sc, num);
		pedirLista(sc, carlos);
		
		for(int f=0; f<tamaño; f++) {
			media+=num[f];
		}
		media/=num.length;
		
		System.out.println(media);
		
		System.out.println("Me has dado estos numero:");
		for(int f=0; f<tamaño; f++) {
			System.out.println(num[f]);
		}
		
	}

	
	
	private static void pedirLista(Scanner sc, int[] num) {
		for(int f=0; f<num.length ; f++) {
			System.out.println("Dame el numero "+(f+1)+"º: ");
			num[f]=sc.nextInt();
		}
	}
	
	
	
}
