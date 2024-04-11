package Actividades_UT4_PowerPoint;
	//Pedir 10 numeros al usuario y dar la suma y media de estos numeros
	import java.util.Scanner;
public class Actividad_23 {
	public static void main(String[]args) {
		//Declaracion de variables
		int suma, num, contador, media;
		contador=0;
		suma=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Te voy a pedir 10 numeros para darte la suma de estos y la media.");
		
		while (contador<10) {
			contador=contador+1;
			System.out.println("Dame el " +contador +" numero");
			num=sc.nextInt();
			suma=suma+num;
		}
		media=suma/10;
		System.out.println("La suma es " +suma +" y la media es " +media);
	}
}
