package Actividades_UT4_PowerPoint;
	/*
	 * Pedir un numero para hacer su raiz
	 * Validar que sea mayor a 0
	 */
	import java.util.Scanner;
public class Actividad_54 {
	public static void main (String args[]) {
		//Variables
		Scanner sc = new Scanner(System.in);
		int num;
		boolean seguir=true;
		char letra;
		
		do {
			num=sc.nextInt();
			while (num<0) {
				System.out.println("Los numeros negativos no son validos");
				num=sc.nextInt();
				//sc.nextLine();
			}
			double resultado= Math.sqrt(num);
			System.out.println(resultado);
			System.out.println("Quieres seguir?");
			System.out.println("S, si");
			System.out.println("N, no");
			letra=sc.next().charAt(0);
			System.out.println(letra);
			if(letra=='n'|| letra=='N') {
				seguir=false;
			}
		}while(seguir==true);
	}
}
