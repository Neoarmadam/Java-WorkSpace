package Ejemplos;
import java.util.ArrayList;
import java.util.Iterator;

public class ejemploArrayList1 {
	public static void main(String[] args) {
		//Declarar un ArrayList
		ArrayList lista=new ArrayList();
		//Declarar ArrayList solo de String
		ArrayList<String> listaS=new ArrayList<String>();
		
		//añadir datos al ArrayList
		lista.add("hola");
		lista.add("David");
		lista.add("xd");
		
		//añadir en una posicion determinada
		lista.add(1,"Ricardo");
		
		imprimirLista(lista);
		
		//cambiar un elemento
		lista.set(1, "Gerardo");
		
		imprimirLista(lista);
		
		//Escribir con el iterator
		Iterator ite=lista.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

	private static void imprimirLista(ArrayList lista) {
		//Escribir ArrayList
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			System.out.println(lista.get(f));
		}
		System.out.println("--------------------");
	}
}
