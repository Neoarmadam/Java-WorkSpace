package Actividades_UT4_PowerPoint;
	//Pedir 4 frases y escribirlas
	import java.util.Scanner;
public class Actividad_29 {
	public static void main (String args []) {
		Scanner sc= new Scanner(System.in);
		String texto;
		
		System.out.println("Introduce 4 frases");
		for (int f=0; f<4; f++) {
		texto=sc.nextLine();
		System.out.println(texto);
		}
	}
}
