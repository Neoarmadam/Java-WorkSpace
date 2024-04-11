package Actividades_UT5_PowerPoint;
	import java.util.Scanner;
public class BusquedaBinariaVectorOrdenado {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] vector= {1,2,3,4,5,6,7,8,9,10,11};
		int num;
		boolean encontrado=false;
		int posicion=0;
		
		System.out.println("Dime numero ha buscar");
		num=sc.nextInt();
		
		
		
		if(num<vector[vector.length-1/2]) {
			if(num<vector[vector.length/4]) {
				for(int f1=0; f1<(vector.length/4); f1++) {
					if (vector[f1]==num) {
						encontrado=true;
						posicion=f1;
						break;
						}
				}
					}else {
						for(int f1=(vector.length/4); f1<(vector.length/2); f1++) {
							if (vector[f1]==num) {
								encontrado=true;
								posicion=f1;
								break;
								}
						}
			}
		}else {
			if(num<(vector.length/4*3)) {
				for(int f1=(vector.length/2); f1<(vector.length/4*3); f1++) {
					if (vector[f1]==num) {
						encontrado=true;
						posicion=f1;
						break;
					}
				}
			}else {
				for(int f1=(vector.length/4*3); f1<vector.length; f1++) {
					if (vector[f1]==num) {
						encontrado=true;
						posicion=f1;
						break;
					}
				}
			}
		}
		if (encontrado==true) {
			System.out.println("Numero encontrado en la posicion " +posicion);
		}else {
			System.out.println("Numero no encontrado");
		}
	}
}
