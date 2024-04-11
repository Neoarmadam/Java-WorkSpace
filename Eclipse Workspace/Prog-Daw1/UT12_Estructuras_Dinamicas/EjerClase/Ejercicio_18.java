package EjerClase;

	import java.util.ArrayList;
	import java.util.Comparator;
	import Ejemplos.Alumno1;
import Utilidades.UtDialogos;

public class Ejercicio_18 {
	public static void main(String[] args) {
		ArrayList <Alumno1> alumnos= new ArrayList<Alumno1>();
		 
		
		//pedirAlumnos(alumnos);
		alumnos.add(new Alumno1(1,21));
		alumnos.add(new Alumno1(2,35));
		alumnos.add(new Alumno1(3,21));
		
		imprimirLista(alumnos);
		
		
		//alumnos.sort(Edad);
		imprimirLista(alumnos);
		
	}

	

	/**
	 * Metodo que pide Alumnos para guardarlos en un array list asta que el id que pide se le de 0 o menor.
	 * @param alumnos
	 */
	private static void pedirAlumnos(ArrayList<Alumno1> alumnos) {
		boolean seguir=true;
		int id, edad;
		UtDialogos.dialoMensaje("Introduce el id y el nombre de los alumnos, cuando me des el id 0 o negativo paro");
		while(seguir) {
			id=UtDialogos.dialoPedirEntero("Introduce el id del alumno");
			if(id<1) {
				seguir=false;
				break;
			}
			edad=UtDialogos.dialoPedirEntero("Introduce la edad del alumno con el id: " +id);
			alumnos.add(new Alumno1(id, edad));
		}
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
