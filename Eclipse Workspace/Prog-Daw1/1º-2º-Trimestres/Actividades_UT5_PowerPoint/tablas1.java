package Actividades_UT5_PowerPoint;

public class tablas1 {
	public static void main(String args[]) {
		int tabla [][]= {{1,2,3},{4,5,6}};
		final int LIM1=tabla[0].length; //Columnas
		final int LIM2=tabla.length;
		System.out.println();
		
		for(int f=0; f<LIM2; f++) {
			for(int f1=0; f1<LIM1; f1++){
				System.out.println(tabla[f][f1]);
			}
			System.out.println();
		}
	}
}
