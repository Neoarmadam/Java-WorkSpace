package Actividades_UT4_PowerPoint;
 //meses
	import java.util.Scanner;
public class Actividad_34 {
	public static void main (String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		int meses;
		int a�o;
		
		System.out.println("Introduce un numero del 1 al 12, respecto a los meses del a�o");
		meses=sc.nextInt();
		switch (meses){
		case 1,3,5,7,8,10,12:
			System.out.println("Tiene 31 dias");
			break;
		case 4,6,9,11:
			System.out.println("Tiene 30 dias");
			break;
		case 2:
			System.out.println("De que a�os?");
			a�o=sc.nextInt();
			if (a�o%100!=0 && a�o%4==0 || a�o%400==0) {
				System.out.println("Tiene 29 dias");
			}else {
				System.out.println("Tiene 28 dias");
			}
		break;
		default:
			System.out.println("Numero no valido");
			break;
		}
		
	}
}
