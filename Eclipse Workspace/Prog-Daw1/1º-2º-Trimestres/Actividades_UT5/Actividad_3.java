package Actividades_UT5;
	/*
	 * Define un array de las notas medias de 4 alumnos en las 3 evaluaciones de un curso.
	 * Inicializa el array a los valores que quieras y después muéstralas por pantalla.
	 */
public class Actividad_3 {
	public static void main (String args[]) {
		
		int [][] notas = {{5,8,7},{9,8,8},{5,6,4}};
		String [] alumnos= {"Neo", "David", "Carlos"};
		
		for (int f1=0; f1<alumnos.length ; f1++) {
			System.out.println(alumnos[f1]+ ": ");
			for (int f2=0; f2<notas[f1].length; f2++) {
				System.out.println(notas [f1][f2]);
			}
		}
		
	}
}
