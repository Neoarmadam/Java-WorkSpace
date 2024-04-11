package Actividades_UT4_PowerPoint;
	/*
	 * Pedir numeros asta introducir 0
	 * Visualizar la multiplicacion de esos numeros menos el 0
	 * Si introduce 0 primero dar error
	 * 
	 */
	import java.util.Scanner;
public class Actividad_24 {
	public static void main(String[]args){
		//Inicializacion de vasiables
		int num, mult, contador;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Te voy a pedir numeros para multiplicarlos, finalizare cuando me des un 0");
		System.out.println("Dame el 1 numero");
		num=sc.nextInt();
		contador=1;
		if (num==0) {
			System.out.println("No se puede continuar");
		}else {
			mult=num;
			while (num>0) {
				mult=mult*num;
				contador=contador+1;
				System.out.println("Dame el " +contador +" numero");
				num=sc.nextInt();	
			}
			System.out.println("La multiplicacion es " +mult);
		}
	}
}
