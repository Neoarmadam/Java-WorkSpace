package UT7_Metodos;
	import java.util.Scanner;
public class ActivMetString1 {
	public static void main (String args[]) {
		String [] vector=new String [3];
		
		pedirfrases(vector);
		imprimefrases(vector);
		mayorfrase(vector);
	}
	
	static void imprimefrases(String [] vector) {
		final int LIM=vector.length;
		for (int f=0; f<LIM; f++) {
			System.out.println(vector[f]);
		}
	}
	
	static void pedirfrases(String [] vector) {
		Scanner sc=new Scanner(System.in);
		final int LIM=vector.length;
		for (int f=0; f<LIM; f++) {
			vector[f]=sc.nextLine();
		}
	}
	
	static void mayorfrase(String []vector) {
		final int LIM=vector.length;
		int posicion=0;
		String mayor=vector[0];
		for (int f=1; f<LIM; f++) {
			if(vector[f].length()>mayor.length()) {
				mayor=vector[f];
				posicion=f+1;
			}
		}
		System.out.println("La mayor frase es '" +mayor +"' en la posicion: " +posicion);
	}
}
