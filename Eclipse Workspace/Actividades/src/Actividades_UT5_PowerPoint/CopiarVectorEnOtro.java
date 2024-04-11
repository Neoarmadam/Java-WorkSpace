package Actividades_UT5_PowerPoint;

public class CopiarVectorEnOtro {
	public static void main (String args[]) {
		//Variables
		int [] vector= {1,2,3,4,5};
		final int LIM=vector.length;
		int [] vectorCopia= new int[LIM];
		int [] vectorEspejo=new int[LIM];
		
		//Resolucion
		for(int f=0; f<LIM; f++) {
			vectorCopia[f]=vector[f];
			vectorEspejo[f]=vector[(LIM-1-f)];
		}
		
		//Comprobacion con dos for
		System.out.println("Vector copia");
		for (int f=0; f<LIM; f++) {
			System.out.println(vectorCopia[f]);
		}
		
		System.out.println("Vector Espejo");
		for(int f=0; f<LIM; f++) {
			System.out.println (vectorEspejo[f]);
		}	
	}
}
