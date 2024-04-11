package Actividades;
	//Tabla de multiplicar del 5
	import java.util.Scanner;
public class TablaMultiplicar5 {
	public static void main(String args[]) {
		int num=0;
		int mult=0;
		
		System.out.println("Dame un numero y te doy la tabla de multipliar de ese numero");
		Scanner sc= new Scanner(System.in);
		mult=sc.nextInt();
		sc.close();
		for (int f=0;f<11;f++) {
			System.out.println(num);
			num=num+mult;
		}
	}
}
