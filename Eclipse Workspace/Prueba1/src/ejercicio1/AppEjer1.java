package ejercicio1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import dialogos.Dialogos;

public class AppEjer1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		final String RUTAALUM="C:\\salidaEXM\\fichAlumnos.abra";
		final String RUTAPROF="C:\\salidaEXM\\fichProfe.abra";
		
		ArrayList<Alumno> alumnos= new <Alumno>ArrayList();
		ArrayList<Profesor> profesores= new <Profesor>ArrayList();
		
		
		Profesor auxProf;
		
		leerProf(profesores, RUTAPROF);
		LeerAlum(alumnos, RUTAALUM);
		
		EscribirLista(alumnos);
		EscribirLista(profesores);
		Dialogos.mostrarWarning("Hay " +ContAlumCiclos(alumnos, "DAW")+" alumnos en el ciclo DAW");
		Dialogos.mostrarWarning("Hay " +ContAlumCiclos(alumnos, "DAM")+" alumnos en el ciclo DAM");
		Dialogos.mostrarWarning("El alumno menor es " +alumnos.get(AlumnoMenor(alumnos)).toString());
		Dialogos.mostrarWarning("El profesor mejor pagado es " +profesores.get(ProfesorMasSueldo(profesores)));
		
		
	}
	/**
	 * Metodo que muestra un arraylist por terminal
	 * @param lista
	 */
	private static void EscribirLista(ArrayList lista) {
		for(int f=0; f<lista.size(); f++) {
			System.out.println(lista.get(f).toString());
		}
	}

	/**
	 * Metodo que devuelve la posicion del profesor con mayor sueldo de un arraylist de profesor
	 * @param profesores
	 * @return int
	 */
	private static int ProfesorMasSueldo(ArrayList<Profesor> profesores) {
		int id=0;
		for (int f=1; f<profesores.size(); f++) {
			if(profesores.get(f).getSueldo()>profesores.get(id).getSueldo()) {
				id=f;
			}
		}
		return id;
	}

	/**
	 * Metodo que devuelve la posicion del alumno con menor edad en un array list de alumno
	 * @param alumnos
	 * @return int
	 */
	private static int AlumnoMenor(ArrayList<Alumno> alumnos) {
		int id=0;
		for (int f=1; f<alumnos.size(); f++) {
			if(alumnos.get(f).getEdad()<alumnos.get(id).getEdad()) {
				id=f;
			}
		}
		return id;
	}

	/**
	 * Metodo que devuelve cuantos alumnos de un array list de alumno esta en un ciclo pasado por parametro
	 * @param alumnos
	 * @param ciclo
	 * @return int
	 */
	private static int ContAlumCiclos(ArrayList<Alumno> alumnos, String ciclo) {
		int contador=0;
		for (int f=0; f<alumnos.size();f++) {
			if(alumnos.get(f).getCiclo().equalsIgnoreCase(ciclo)) {
				contador++;
			}
		}
		return contador;
	}

	/**
	 * Metodo que lee de un archivos objetos de la clase alumnos y los guarda en un arraylist
	 * @param alumnos
	 * @param entAlum
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private static void LeerAlum(ArrayList<Alumno> alumnos, String RUTAALUM) throws FileNotFoundException, IOException {
		ObjectInputStream entAlum= new ObjectInputStream(new FileInputStream(RUTAALUM));
		try {
			while(true) {
				alumnos.add((Alumno) entAlum.readObject());
			}
		}catch(Exception ao) {
			System.out.println("He leido "+alumnos.size()+" Alumnos");
		}
	}

	/**
	 * Metodo que lee de un archivo objetos de la clase profesor y los guarda en un array list
	 * @param profesores
	 * @param RUTAPROF
	 * @throws IOException
	 */
	private static void leerProf(ArrayList<Profesor> profesores, String RUTAPROF) throws IOException {
		ObjectInputStream entProf= new ObjectInputStream(new FileInputStream(RUTAPROF));
		try {
			while(true) {
				profesores.add((Profesor) entProf.readObject());
			}
		}catch(Exception ao) {
			entProf.close();
			System.out.println("He leido "+profesores.size()+" profesores");
		}
	}
}
