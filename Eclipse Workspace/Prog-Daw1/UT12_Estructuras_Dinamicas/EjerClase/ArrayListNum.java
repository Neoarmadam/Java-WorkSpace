package EjerClase;
import java.util.ArrayList;

import Utilidades.UtDialogos;
public class ArrayListNum {
	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		int num;
		
		num=UtDialogos.dialoPedirEntero("Dame un numero para guardar en el Array");
		while(num!=0) {
			lista.add(num);
			num=UtDialogos.dialoPedirEntero("Dame un numero para guardar en el Array");
		}
		
		
		UtDialogos.dialoMensaje("La suma es " +sumarLista(lista));
		UtDialogos.dialoMensaje("La media es " +mediaLista(lista));
		
		
	}

	/**
	 * Devuelve la media de un ArrayList numerico
	 * @param lista
	 * @return
	 */
	private static double mediaLista(ArrayList<Integer> lista) {
		double media=sumarLista(lista)/lista.size();
		return media;
	}

	/**
	 * Suma todos los valores de una lista numerica
	 * @param lista
	 * @return
	 */
	private static int sumarLista(ArrayList<Integer> lista) {
		int suma=0;
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			suma=suma+(Integer) lista.get(f);
		}
		 return suma;
	}
	
	/**
	 * Imprime un array list dado por parametro
	 * @param lista
	 */
	private static void imprimirLista(ArrayList<Integer> lista) {
		//Escribir ArrayList
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			System.out.println(lista.get(f));
		}
		System.out.println("--------------------");
	}
	
	
}
