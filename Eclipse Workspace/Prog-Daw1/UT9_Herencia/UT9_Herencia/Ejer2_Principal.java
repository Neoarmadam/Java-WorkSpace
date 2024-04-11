package UT9_Herencia;

public class Ejer2_Principal {
	public static void main (String args[]) {
		Ejer2_Persona[] personas=new Ejer2_Persona[1];
		Ejer2_Mamifero[] mamiferos=new Ejer2_Mamifero[2];
		Ejer2_Animal[] animales=new Ejer2_Animal[1];
		/*
		pedirDatos(personas);
		pedirDatos(mamiferos);
		pedirDatos(animales);
		*/
		personas[0]=new Ejer2_Persona();
		
		escribirDatos(personas);
		/*
		escribirDatos(mamiferos);
		escribirDatos(animales);
		*/
	}
	
	public static void pedirDatos(Ejer2_Persona[] personas) {
		final int LIM=personas.length;
		for(int f=0;f<LIM; f++) {
			personas[f]=new Ejer2_Persona();
			personas[f].pedirPersona();
		}
	}
	
	public static void pedirDatos(Ejer2_Mamifero[] mamiferos) {
		final int LIM=mamiferos.length;
		for(int f=0;f<LIM; f++) {
			mamiferos[f]=new Ejer2_Mamifero();
			mamiferos[f].pedirMamifero();
		}
	}
	public static void pedirDatos(Ejer2_Animal[] animales) {
		final int LIM=animales.length;
		for(int f=0;f<LIM; f++) {
			animales[f]=new Ejer2_Animal();
			animales[f].pedirAnimal();
		}
	}
	
	public static void escribirDatos(Ejer2_Persona[] personas) {
		final int LIM=personas.length;
		for(int f=0;f<LIM; f++) {
			System.out.println(personas[f].toString());
		}
	}
	
	public static void escribirDatos(Ejer2_Mamifero[] mamiferos) {
		final int LIM=mamiferos.length;
		for(int f=0;f<LIM; f++) {
			System.out.println(mamiferos[f].toString());
		}
	}
	
	public static void escribirDatos(Ejer2_Animal[] animales) {
		final int LIM=animales.length;
		for(int f=0;f<LIM; f++) {
			System.out.println(animales[f].toString());
		}
	}
}


