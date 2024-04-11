package Actividades;

public class DibujarTriangulo {
	public static void main (String args[]) {
		//Variables
		int limE1=2;
		int limE2=4;
		
		int lim1=1;
		int lim2;
		
		
		//Resolucion
		for(int f1=0; f1<3; f1++) {
			
			for(int f3=0; f3<limE1;f3++) {
				System.out.print(" ");
			}
			for(int f2=0; f2<lim1; f2++) {
				System.out.print("*");
			}
			System.out.println();
			limE1-=1;
			lim1+=2;
		}
		
		
	}
}
