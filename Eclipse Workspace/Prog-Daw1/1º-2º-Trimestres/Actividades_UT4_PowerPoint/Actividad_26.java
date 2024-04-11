package Actividades_UT4_PowerPoint;
	/*
	 * Pedir numeros asta que el usuario de <=10
	 * Cuando lo inserte que el programa indique por que ha acabado mostrando el numero
	 */
	import java.util.Scanner;
public class Actividad_26 {
	public static void main(String args[]){
		//Variables
		int num;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Te voy a pedir numeros, y cuando me des un numero igual o mayor a 10 finalizare :(");
		num=sc.nextInt();
		while (num>=10) {
			System.out.println("Has introducido el numero " +num);
			num=sc.nextInt();
		}
		System.out.println("Has introducido un numero igual o mayor ha cero");
		System.out.println("Has introducido " +num);
		System.out.println("Adios amigo :(");
	}

}
