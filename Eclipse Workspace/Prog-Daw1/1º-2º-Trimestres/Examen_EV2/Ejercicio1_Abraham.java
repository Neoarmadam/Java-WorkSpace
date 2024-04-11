package Examen_EV2;
	import java.util.Scanner;
public class Ejercicio1_Abraham {
	public static void main (String [] args) {
		String completa;
		char letra;
		int cont=0;
		Scanner sc=new Scanner(System.in);
		//Sin metodos
		/*
		System.out.println("Dime la cadena");
		completa=sc.nextLine();
		System.out.println("Dime el caracter");
		letra=sc.next().charAt(0);
		
		for(int f=0; f<completa.length(); f++) {
			if(completa.charAt(f)==letra) {
				cont++;
			}
		}
		System.out.println("Ha aparecido " +cont +" veces");
		*/
		completa=pedirCadena();
		letra=pedirLetra();
		cont=verificarCaracter(completa,letra);
		System.out.println("Ha aparecido " +cont +" veces");
	}
	
	public static String pedirCadena() {
		Scanner sc=new Scanner(System.in);
		String completa;
		System.out.println("Dime la cadena");
		completa=sc.nextLine();
		return completa;
	}
	
	public static char pedirLetra() {
		Scanner sc=new Scanner(System.in);
		char letra;
		System.out.println("Dime el caracter");
		letra=sc.next().charAt(0);
		return letra;
	}
	
	public static int verificarCaracter(String completa, char letra) {
		int cont=0;
		for(int f=0; f<completa.length(); f++) {
			if(completa.charAt(f)==letra) {
				cont++;
			}
		}
		return cont;
	}
}
