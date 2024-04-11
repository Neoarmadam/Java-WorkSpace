package ActividadesClaseAlumno;
	import java.util.Scanner;
public class Actividad_7 {
	public static void main (String args[]) {
		int opcion;
		final int numProf=2;
		Profesor [] profs=new Profesor[numProf];
		
		
		for(int f=0; f<numProf; f++) {
			profs[f]=new Profesor();
			profs[f].pedirProfesor();
		}
		
		opcion=menu2();
		profs[0].getNombreProf();
		if(opcion==1) {
			opcion1(profs);
		}if(opcion==3) {
			opcion3(profs);
		}else {
			opcion2(profs);
		}
	}
	
	public static void menu1() {
		System.out.println("---------Menu-----------");
		System.out.println("1: Visualizar Modulos de un profesor");
		System.out.println("2: Visualizar profesor de una especialidad");
		System.out.println("3: Visualizar los profesores que dan un modulo");
		System.out.println("Otra opcion: Estallar");
	}
	public static int menu2() {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			menu1();
			opcion=sc.nextInt();
		}while(opcion<1 || opcion>3);
		return opcion;
	}
	public static void opcion1(Profesor...prof ) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		System.out.println("Elija que profesor mostrar sus modulos");
		System.out.println("-----------------------------------------");
		for (int f=0; f<prof.length; f++) {
			System.out.println((f+1) +": "+prof[f].getNombreProf());
		}
		opcion=sc.nextInt();
		while(opcion<0 || opcion>prof.length) {
			System.out.println("Error, eliga una opcion valida");
			opcion=sc.nextInt();
		}
		prof[opcion-1].getModProf();
	}
	public static void opcion2(Profesor...prof) {
		Scanner sc=new Scanner(System.in);
		boolean encontrado=false;
		String especialidad;
		
		System.out.println("Introduce la especialidad");
		especialidad=sc.nextLine();
		for(int f=0; f<prof.length; f++) {
			if(especialidad.equalsIgnoreCase(prof[f].getEspProf())) {
				System.out.println(prof[f].getNombreProf());
				encontrado=true;
			}
		}
		if(encontrado==false) {
			System.out.println("No hay ningun profesor");
		}
	}
	
	public static void opcion3(Profesor...prof) {
		Scanner sc=new Scanner(System.in);
		boolean encontrado=false;
		String modulo;
		String [] modulos;
		
		System.out.println("Introduce el modulo a buscar");
		modulo=sc.nextLine();
		while(modulo.length()!=4) {
			System.out.println("Error, modulo no valido");
			modulo=sc.nextLine();
		}
		for(int f=0; f<prof.length; f++) {
			modulos=prof[f].getModProf2();
			for(int f1=0; f1<modulos.length; f1++) {
				if (modulo.equalsIgnoreCase(modulos[f1])) {
					System.out.println(prof[f].getNombreProf());
					encontrado=true;
					break;
				}
			}
		}
		if(encontrado==false) {
			System.out.println("ningun profesor da ese modulo");
		}
	}
}
