package Actividades_UT5_PowerPoint;
	import java.util.Scanner;
public class ContarRepetirNum {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] vector= {1,2,3,4,4,4,2,5,6,5,2,234,3,7,9,0,1,2,5,6};
		int num;
		int contador=0;
		boolean primer=false;
		int posicion;
		
		System.out.println("Dime numero ha buscar");
		num=sc.nextInt();
		
		for (int f=vector.length; f<0; f=f-1) {
			if (vector[f]==num) {
				contador=contador+1;
				if(primer==false) {
					posicion=f;
					primer=true;
				}
			}
		}
		if(primer==true) {
			System.out.println("Esta "+contador+" veces");
			System.out.println("La primera posicion fue "+contador);
		}else {
			System.out.println("no esta");
		}
		
	}
}
