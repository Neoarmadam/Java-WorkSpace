package Actividades_UT6_PowerPoint;

import java.util.Scanner;

public class GuardarStringEspejo {
	public static void main (String args[]) {
		/**Variables**/
		Scanner sc=new Scanner(System.in);
		String cadena="Martes 17 de Febrero";
		final int LIM=cadena.length();
		String cadenaEspejo="";
		
		/**Resolucion**/
		for(int f=0; f<LIM; f++) {
			cadenaEspejo=cadenaEspejo+cadena.charAt(LIM-1-f);
		}
		for(int f=0; f<LIM; f++) {
			System.out.print(cadenaEspejo.charAt(f));
		}
	}
}
