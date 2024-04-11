package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_9_Vector {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		int vector[];
		do {
			num1=sc.nextInt();
			num2=sc.nextInt();
			if (num1>num2) {
				System.out.println("Error, el primer numero debe ser el menor");
			}
		}while(num1>num2);
		
		vector=comprendidos(num2, num1);
		
		for(int f=0; f<vector.length; f++) {
			System.out.println(vector[f]);
		}
	}
	
	static int[] comprendidos(int mayor, int menor ) {
		int lim=mayor-menor+1;
		int vector[]=new int[lim];
		for(int f=0;f<lim;f++) {
			vector[f]=(menor+f);
		}
		return vector;
	}
}
