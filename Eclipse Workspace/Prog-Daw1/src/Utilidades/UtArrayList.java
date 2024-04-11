package Utilidades;
	import java.util.ArrayList;
public class UtArrayList {
	
	/**
	 * Imprime un ArrayList dado por parametro.
	 * @param lista
	 */
	public static void imprimirLista(ArrayList<?> lista) {
		//Escribir ArrayList
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			System.out.println(lista.get(f));
		}
		System.out.println("--------------------");
	}
	
	
}
