package UT7_Metodos;
	import java.util.Scanner;
public class ActivMetString2 {
	public static void main (String[]args) {
	Scanner sc=new Scanner(System.in);
	String [] lista;
	int tamlist;
	
	System.out.println("Dame tamaño de lista");
	tamlist=sc.nextInt();
	lista=new String[tamlist];
	pedirLista(lista);
	ordenarLista(lista);
	imprimirLista(lista);
	}
	
	static void pedirLista(String [] lista) {
		final int LIM=lista.length;
		Scanner sc=new Scanner(System.in);
		for (int f=0; f<LIM; f++) {
			lista[f]=sc.nextLine();
		}
	}
	
	static void ordenarLista(String [] lista) {
		boolean cambios=false;
		String aux;
		final int TAM=lista.length;
		int valor;
		
		for(int f2=0; f2<TAM; f2++) {
			cambios=false;
			for(int f=0; f<TAM-1-f2; f++) {
				valor=lista[f].length()-lista[f+1].length();
				//contador=contador+1;
				if(valor<0) {
					//pasar ingles
					aux=lista[f+1];
					lista[f+1]=lista[f];
					lista[f]=aux;
					
					
					cambios=true;
				}
				}
			if(cambios==false) {
				break;
			}
		}
	}
	
	static void imprimirLista(String[] lista) {
		final int LIM=lista.length;
		for (int f=0; f<LIM; f++) {
			System.out.println(lista[f]);
		}
	}
}
