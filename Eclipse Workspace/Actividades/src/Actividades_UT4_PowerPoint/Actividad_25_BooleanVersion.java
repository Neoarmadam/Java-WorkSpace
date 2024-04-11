package Actividades_UT4_PowerPoint;
import java.util.Scanner;

public class Actividad_25_BooleanVersion {
	public static void main(String args[]) {
		//Variables
		int num;
		boolean sigo=true;
		float resto;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Te voy a pedir numeros hasta que me des un numero par");
		while (sigo) {
			num=sc.nextInt();
			resto=num%2;
			if(resto==0) {
				sigo=false;
			}else {
				System.out.println("El numero introducido es " +num);
			}
		}
		System.out.println("Introduciste un numero par");
		
	}
}
