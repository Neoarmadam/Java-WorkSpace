package Actividades_UT5_PowerPoint;
	import java.util.Scanner;
public class BusquedaLinealVectorOrdenado {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] vector= {1,2,4,6,7,8,9,11,13,15,16};
		int num;
		boolean encontrado=false;
		int posicion=0;
		
		System.out.println("Dime numero ha buscar");
		num=sc.nextInt();
		
		
		for(int f1=0; f1<vector.length; f1++) {
			if (vector[f1]==num) {
				encontrado=true;
				posicion=f1;
				break;
			}
			if (vector[f1]>num) {
				break;
			}
		}
		if (encontrado==true) {
			System.out.println("Numero encontrado en la posicion " +posicion);
		}else {
			System.out.println("Numero no encontrado");
		}
	}
}
