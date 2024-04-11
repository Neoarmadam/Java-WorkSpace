package Actividades;

public class DibujarTriangulo {
	public static void main (String args[]) {
		//Variables
		int lim=3;
		int lim1=lim-1;
		int lim2=1;
		
		
		//Resolucion
		for(int f1=0; f1<lim; f1++) {
			
			for(int f3=0; f3<lim1;f3++) {
				System.out.print(" ");
			}
			for(int f2=0; f2<lim2; f2++) {
				System.out.print("*");
			}
			System.out.println();
			lim1-=1;
			lim2+=2;
		}
		
		
	}
}
