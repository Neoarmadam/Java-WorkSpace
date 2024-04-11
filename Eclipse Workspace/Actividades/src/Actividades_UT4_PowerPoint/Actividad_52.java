package Actividades_UT4_PowerPoint;
	/*
	 * Pedir numeros no comprendidos entre 10 y 50
	 * Si se da entre 10 y 50 dara error y explotara
	 * Media de numeros positivos
	 * Mostrar si se introducio un numero negativo
	 */
	import java.util.Scanner;
public class Actividad_52 {
	public static void main (String args[]) {
		//Vasiables
		Scanner sc=new Scanner(System.in);
		int num=0;
		boolean error=false;
		boolean negativos=false;
		int media=0;
		int contador=0;
		
		//Resolucion
		for (int f=0; f<10; f++) {
			num=sc.nextInt();
			if(num<0) {
				negativos=true;
			}
			if(num>0) {
				media+=num;
				contador+=1;
			}
			if (num>=10 && num<=50) {
				System.out.println("Error");
				//f=10;
				error=true;
				break;
			}
		}
		if (error==false) {
			System.out.println("La media es " +(media/contador));
			if(negativos==true) {
				System.out.println("Y se han introducido negativos");
			}else {
				System.out.println("No se han introducido negativos");
			}
		}
	}
}
