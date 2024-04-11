package EjerClase;
	import java.util.ArrayList;
	import Ejemplos.Alumno1;
import Utilidades.UtDialogos;
	
public class Ejercicio_17 {
	public static void main(String[] args) {
		ArrayList <Alumno1> alumnos= new ArrayList<Alumno1>();
		
		//(int id, int edad, float altura, char grupo, String ciclo) 
		
		pedirAlumnos(alumnos);
		imprimirLista(alumnos);
		elimMenoresEdad(alumnos);
		imprimirLista(alumnos);
		
	}

	/**
	 * Elimina los Alumnos menores de edad de un ArrayList
	 * @param alumnos
	 */
	private static void elimMenoresEdad(ArrayList<Alumno1> alumnos) {
		int lim=alumnos.size();
		for(int f=0; f<lim; f++) {
			if(alumnos.get(f).getEdad()<18) {
				alumnos.remove(f);
				f--;
				lim--;
			}
		}
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
