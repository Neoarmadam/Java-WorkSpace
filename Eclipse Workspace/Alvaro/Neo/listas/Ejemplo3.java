package listas;

import java.util.ArrayList;

public class Ejemplo3 {
	public static void main(String[] args) {
		ArrayList mierda=new ArrayList();
		
		mierda.add(5);
		mierda.add("hola");
		
		mierda.add("pene");
		
		imprimirLista(mierda);
	}
	
	public static void imprimirLista(ArrayList<?> lista) {
		//Escribir ArrayList
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			System.out.println(lista.get(f));
		}
		System.out.println("--------------------");
	}
	
	
}
