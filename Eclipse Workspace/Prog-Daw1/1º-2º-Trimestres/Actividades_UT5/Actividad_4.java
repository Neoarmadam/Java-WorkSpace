package Actividades_UT5;
	/*
	 * Escribe un programa que pida las notas que han obtenido los 6 alumnos de una clase en
	 * un determinado módulo y el nombre de cada uno de los alumnos. Después, se visualizará
	 * por pantalla el nombre de cada alumno con su nota.
	 */
	import java.util.Scanner;
public class Actividad_4 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		final int NUMALUM=6;
		String [] alumnos= {"","","","","","",};
		int [] notas=new int [NUMALUM];
		
		System.out.println("Te voy a pedir el nombre del alumno junto a su nota correspondiente.");
		for (int f1=0; f1<NUMALUM; f1++) {
			System.out.println("Dame el nombre del " +(f1+1) +"º alumno.");
			alumnos[f1]=sc.next();
			System.out.println("Dame la nota de " +alumnos[f1] +".");
			notas[f1]=sc.nextInt();
		}
		
		for (int f1=0; f1<NUMALUM; f1++) {
			System.out.println("El alumno " +alumnos[f1] +" ha sacado un " +notas[f1]);
		}
	}
}
