package ActividadesClaseAlumno;
	//Actividad 1
	import java.util.Arrays;
import java.util.Scanner;
public class Alumno {
	/**Variables**/
	private String nombre;
	private int curso;
	private int [] notas=new int [5];
	
	public static void main (String args[]) {
		Alumno neo=new Alumno();
		neo.rellenarAlumno("neo", 5674, 5,6,2,2,8);
		System.out.println(neo.toString());
	}
	
	/**Constructores**/
	public void rellenarAlumno() { //Sin argumentos
		nombre=null;
		curso=0;
		//notas=null;
	}
	
	public void rellenarAlumno(String setNombre) { //Solo Nombre
		nombre=setNombre;
		curso=0;
		notas=null;
	}
	
	public void rellenarAlumno(String setNombre, int setCurso) { //Nombre y curso
		nombre=setNombre;
		curso=verificarCurso(setCurso);
		notas=null;
	}
	
	public void rellenarAlumno(String setNombre, int setCurso, int... setNotas) { //Todo
		nombre=setNombre;
		curso=verificarCurso(setCurso);
		notas=setNotas;
	}
	
	/**Pedir Datos**/
	public void pedirDatos() {
		Scanner sc=new Scanner(System.in);
		int []notas=new int [5];
		int curso;
		String nombre;
		
		System.out.println("introduce el nombre del alumno:");
		nombre=sc.next();
		sc.nextLine(); //Limpiar scanner
		System.out.println("Introduce el curso");
		curso=sc.nextInt();
		curso=verificarCurso(curso);
		System.out.println("Ahora introduzca las notas");
		for(int f=0; f<5; f++) {
			System.out.println("Introduzca la " +(f+1) +" nota");
			notas[f]=sc.nextInt();
		}
		rellenarAlumno(nombre, curso, notas);
	}
	
	/**Media**/
	public int mediaVector(Alumno alum) {
		int media=0;
		for(int f=0; f<notas.length; f++) {
			media=media+notas[f];
		}
		media=media/notas.length;
		return media;
	}
	/**Beca**/
	public void beca(int notas) {
		if(notas>7) {
			System.out.println("Tiene beca");
		}else {
			System.out.println("No tiene beca");
		}
	}
	
	/**Suspensos**/
	public String suspensos(int... notas) {
		int sus=0;
		for(int f=0; f<notas.length; f++) {
			if (notas[f]<5) {
				sus++;
			}
		}
		return sus+" suspensos";
	}
	
	/**Modificar Vector**/
	public void modNotas(int... notas) {
		Scanner sc=new Scanner(System.in);
		String respuesta=null;
		int nota, notaCam;
		System.out.println("deseas modificar alguna nota?");
		System.out.println("S: si, el resto no");
		respuesta=sc.nextLine();
		if(respuesta.equalsIgnoreCase("s")) {
			System.out.println("Que nota desea modificar");
			for(int f=0; f<this.notas.length; f++) {
				System.out.println((f+1)+": "+this.notas[f]);
			}
			nota=sc.nextInt();
			while(nota<1 || nota>5) {
				System.out.println("Elige una de las opciones");
				nota=sc.nextInt();
			}
			System.out.println("Que nota deseas poner?");
			notaCam=sc.nextInt();
			while(nota<0 || nota>10) {
				System.out.println("Nota no valida");
				notaCam=sc.nextInt();
			}
			this.notas[nota-1]=notaCam;
			System.out.println("Nota cambiada");
		}else {
			System.out.println("No se modificaran las notas");
		}
	}
	/**Repite**/
	public void repite(Alumno alum) {
		int contador=0;
		for (int f=0; f<notas.length; f++) {
			if(notas[f]<5) {
				contador++;
			}
		}
		if(contador>2) {
			System.out.println("Repite");
		}else {
			System.out.println("Aprueba");
		}
	}
	/**Matriculas de Honor**/
	public void matriculasHonor(Alumno alum) {
		int contador=0;
		for(int f=0; f<notas.length; f++) {
			if(notas[f]==10) {
				contador++;
			}
		}
		System.out.println("Matriculas de honor: "+contador);
	}
	
	/**Sobresalientes**/
	public void sobresalientes(Alumno alum) {
		int contador=0;
		for(int f=0; f<notas.length; f++) {
			if(notas[f]==9) {
				contador++;
			}
		}
		System.out.println("Sobresalientes: "+contador);
	}
	
	/**Notables**/
	public void notables(Alumno alum) {
		int contador=0;
		for(int f=0; f<notas.length; f++) {
			if(notas[f]==8 || notas[f]==7) {
				contador++;
			}
		}
		System.out.println("Notables: "+contador);
	}
	/**To String**/
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	/**Metodos Adicionales**/
	private int verificarCurso(int curso) {
		Scanner sc=new Scanner(System.in);
		while(curso>9999 || curso<1000) {
			System.out.println("Curso no valido, introduzca un curso valido");
			System.out.println("Introduzca un numero de 4 digitos");
			curso=sc.nextInt();
		}
		return curso;
	}
}
