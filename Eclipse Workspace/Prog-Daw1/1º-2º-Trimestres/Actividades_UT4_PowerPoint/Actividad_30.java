package Actividades_UT4_PowerPoint;
	//Sumar 6 numeros pedidos por teclado
	import java.util.Scanner;
public class Actividad_30 {
	public static void main(String args[]) {
		int num, suma=0;
		Scanner sc= new Scanner(System.in);
		for(int f=0; f<6; f=f+1){
			num=sc.nextInt();
			suma=suma+num;
		}
		System.out.println(suma);
	}
}
