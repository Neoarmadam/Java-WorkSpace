package ActividadesClaseAlumno;
	import java.util.Arrays;
import java.util.Scanner;
public class Profesor {
	String nombre;
	String especialidad;
	String[] modulos=new String[3];
	
	
	public static void main (String args[]) {
		
	}
	/**Constructores**/
	public Profesor() { //Sin argumentos
		nombre=null;
		especialidad=null;
		for(int f=0; f<modulos.length; f++) {
			modulos[f]=null;
		}
	}
	
	public Profesor(String setNombre, String setEspecialidad, String... setModulos) {
		nombre=setNombre;
		especialidad=setEspecialidad;
		modulos=setModulos;
	}
	
	/**Pedir datos**/
	public void pedirProfesor() {
		Scanner sc=new Scanner(System.in);
		String setNombre, setEspecialidad;
		String[] setModulos=new String[3];
		int cantModulos;
		
		System.out.println("Introduzca el nombre del profesor");
		setNombre=sc.nextLine();
		System.out.println("Introduzca su especialidad");
		setEspecialidad=sc.nextLine();
		System.out.println("A cuantos modulos da clase");
		cantModulos=sc.nextInt();
		sc.nextLine();
		while(cantModulos<1 || cantModulos>3) {
			System.out.println("Error, introduce un numero de modulos entre 1-3");
			cantModulos=sc.nextInt();
		}
		for(int f=0; f<cantModulos; f++) {
			System.out.println("Introduce el modulo "+(f+1) +" que enseña el profesor");
			setModulos[f]=sc.nextLine();
			setModulos[f]=verificarModulos(setModulos[f]);
		}
		nombre=setNombre;
		especialidad=setEspecialidad;
		modulos=setModulos;
	}
	
	/**get nombre profesor**/
	public String getNombreProf() {
		return nombre;
	}
	/**get modulos profesor**/
	public void getModProf() {
		for(int f=0; f<modulos.length; f++) {
			System.out.println(modulos[f]);
		}
	}
	public String[] getModProf2() {
		return modulos;
	}
	/**get Especialidad**/
		public String getEspProf() {
			return especialidad;
		}
	
	/**Modificar Especialidad**/
		public void modEspProf() {
			Scanner sc =new Scanner(System.in);
			String setEspecialidad=sc.nextLine();
			especialidad=setEspecialidad;
		}
	/**Modificar modulos**/
	public void modModProf() {
		Scanner sc=new Scanner(System.in);
		int cantModulos;
		
		System.out.println("A cuantos modulos da clase");
		cantModulos=sc.nextInt();
		sc.nextLine();
		while(cantModulos<1 || cantModulos>3) {
			System.out.println("Error, introduce un numero de modulos entre 1-3");
			cantModulos=sc.nextInt();
		}
		for(int f=0; f<cantModulos; f++) {
			System.out.println("Introduce el modulo "+(f+1) +" que enseña el profesor");
			modulos[f]=sc.nextLine();
			modulos[f]=verificarModulos(modulos[f]);
		}
	}
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", especialidad=" + especialidad + ", modulos=" + Arrays.toString(modulos)
		    + "]";
	}
	/**Modificar Nombre Profesor**/
	public void modNomProf() {
		Scanner sc =new Scanner(System.in);
		String setNombre=sc.nextLine();
		nombre=setNombre;
	}
	
	/**Metodos Adicionales**/
	public String verificarModulos(String modulo) {
		Scanner sc=new Scanner(System.in);
		while(modulo.length()!=4) {
			System.out.println("Codigo de modulo no valido");
			modulo=sc.nextLine();
		}
		return modulo;
	}
}
