package Actividades_UT5_PowerPoint;

import java.util.Arrays;

public class OrdenarVectorConCorridas {
	public static void main (String args[]) {
		/**Variables**/
		int vector[]= {9,5,9,2,7,3,7,9,4};
		int aux;
		int tam=vector.length;
		boolean cambios =false;
		
		Arrays.sort(vector);
		
		/**Escribir Vector**/
		for(int f=0; f<tam; f++) {
			System.out.print(vector[f] +", ");
		}
	}
}
