package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_8 {
	public static void main (String args[]) {
		final int TAM=6;
		int vector[]=new int[TAM];
		int mayorPos;

		for(int f=0;f<TAM;f++) {
			vector[f]=pedirInt();
		}
		mayorPos=mayorVector(vector);
		System.out.println(vector[mayorPos]+" en la posicion " +mayorPos);
	}
	static int pedirInt() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		return num;
	}
	static int mayorVector(int a[]) {
		final int LIM=a.length;
		int mayor;
		int posMay=0;
		mayor=a[0];
		for (int f=1; f<LIM;f++) {
			if(a[f]>mayor) {
				mayor=a[f];
				posMay=f;
			}
		}
		return posMay;
	}
}
