package Actividades_UT5_PowerPoint;
	
public class OrdenarVector {
	public static void main (String args[]) {
		/**Variables**/
		//int vector[]= {4,8,2,7,0,5,7,9,4,6,9,8};
		int vector[]= {21,1,2,32,3,4,5,6};
		int aux;
		int tam=vector.length;
		int contador=0;
		boolean cambios=false;
		
		/**Ordenar vector**/
		for(int f2=0; f2<tam; f2++) {
			cambios=false;
			for(int f=0; f<tam-1-f2; f++) {
				contador=contador+1;
				if(vector[f]>vector[f+1]) {
					aux=vector[f+1];
					vector[f+1]=vector[f];
					vector[f]=aux;
					cambios=true;
				}
				}
			if(cambios==false) {
				break;
			}
		}
		
		/**Escribir Vector**/
		for(int f=0; f<tam; f++) {
			System.out.print(vector[f] +", ");
		}
		System.out.println();
		System.out.println(contador);
	}
}
