package Actividades_UT4_PowerPoint;
	/*
	 * Dado un valor N y un valor Y
	 * Mostrar numeros correlativos desde 1 hasta N
	 * Emmplazar  por u "*" los multiplos de Y
	 */
	import java.util.Scanner;
public class Actividad_48 {
	public static void main (String args[]) {
		//Variables
		Scanner sc = new Scanner(System.in);
		int n, y; //Les llamo como les llama el enunciado.
		int correlativos=0;
		
		System.out.println("Voy a darte los numeros correlativos entre 1 y n,");
		System.out.println("y ha mostrar con un * los multiplos de Y");
		System.out.println("Voy a pedirte el valor n");
		n=sc.nextInt();
		System.out.println("Voy a pedirte el valor y");
		y=sc.nextInt();
		
		for (int f=0; f<n; f++) {
			correlativos++;
			if(correlativos%y==0) {
				System.out.println("*");
			} else{
				System.out.println(correlativos);
			}
		}
		
	}
}
