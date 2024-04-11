package Ejemplos;
	import java.util.ArrayList;
import java.util.Iterator;

public class listaAlumnos {
	static ArrayList<Alumno1> alumnos=new ArrayList<Alumno1>();
	public static void main(String[] args) {
		//Insertar datos en la Lista
		Alumno1 alum=new Alumno1(1, 19, 176, 'z', "Daw");
		alumnos.add(alum);
		alum=new Alumno1(2, 21, 176, 'z', "Daw");
		alumnos.add(alum);
		alum=new Alumno1(3, 35, 176, 'z', "Daw");
		alumnos.add(alum);
		
		for(int f=0; f<alumnos.size(); f++) {
			alumnos.get(f).setGrupo('v');
		}
		
		for (Alumno1 alu : alumnos) {
			if (alu.getEdad()>34) {
				alu.setGrupo('c');
			}else {
				alu.setGrupo('a');
			}
		}
		
		
		imprimirLista(alumnos);
	}
	
	/**
	 * Imprime un array list dado por parametro
	 * @param lista
	 */
	private static void imprimirLista(ArrayList lista) {
		//Escribir ArrayList
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			System.out.println(lista.get(f));
		}
		System.out.println("--------------------");
	}
}
