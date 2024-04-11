package Actividades_UT4_PowerPoint;
	/*
	 * Mostrar la suma de los numeros impares comprendidos
	 * entre 1 y 50, incluyendo a estos
	 */
public class Actividad_37 {
	public static void main(String args[]) {
		
		//Declaracion de variables
		int suma=0;
		int num=1;
		int LIM=50;
		
		for(int f=0; f<LIM; f=f+2) { //Pongo a 50 el limite y sumo de dos en dos por que los impares son la mitad de los numeros
			suma=suma+num;
			num=num+2;
		}
		System.out.println(suma);
	}
}
