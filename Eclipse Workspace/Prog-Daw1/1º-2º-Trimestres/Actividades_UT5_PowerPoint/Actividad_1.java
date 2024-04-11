package Actividades_UT5_PowerPoint;

public class Actividad_1 {
	public static void main (String args[]) {
		int edad1, edad2, edad3, edad4, edad5;
		int [] edades=new int[5];
		int [] cursos= {1,2,4,6,25};
		edades [0]=22;
		
		System.out.println(edades[0]);
		System.out.println(cursos[0]);
		
		System.out.println ("El vector tiene "+cursos.length );
		for (int f=0; f<5; f++) { 
			System.out.println(cursos[f]);
		}
	}
}
