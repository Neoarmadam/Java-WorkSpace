import java.util.ArrayList;
import java.util.Collections;

import Utilidades.UtArrayList;

public class ListasApp {
	public static void main(String[] args) {
		ArrayList<Alumno> list=new ArrayList<Alumno>();
		//int id, int edad, float altura, char grupo, String ciclo
		list.add(new Alumno(21,176, 'D',"Daw"));
		list.add(new Alumno(35,176, 'D',"Daw"));
		list.add(new Alumno(21,173, 'D',"Daw"));
		UtArrayList.imprimirLista(list);
		
		Collections.sort(list,new MiComparador());
		UtArrayList.imprimirLista(list);
		
		System.out.println(list.indexOf(new Alumno(21,173, 'D',"Daw")));
	}
	
	
}
