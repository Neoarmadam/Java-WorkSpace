package ArrayList;

import java.util.ArrayList;
import Objetos.Movil;

public class ArrayListMovil {
	public static void main(String[] args) {
		ArrayList<Movil> lista= new ArrayList<Movil>();
		Movil neo;
		
		lista.add(new Movil("Realme gt Neo 3T","Realme",8,"Snapdragon 870"));
		
		System.out.println(lista.get(0).toString());
	}
}
