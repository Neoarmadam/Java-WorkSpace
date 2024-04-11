package Actividades_UT5_PowerPoint;
	import java.util.Scanner;
	
public class Actividad_4 {
	public static void main (String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		String [] modulos= {"Sistemas Informaticos", 
				"Bases de Datos", "Programacion","Lenguajes de Marcas",
				"Entornos de Desarrollo", "Acceso a Datos"};
		final int COLUMNAS=modulos.length;
		final int FILAS=2;
		int  [][] matriculados= new int [FILAS][COLUMNAS];
		String cursos[]= {"Daw1","Biling"};
		
		
		for(int f1=0; f1<FILAS; f1++) {
			for (int f2=0; f2<COLUMNAS; f2++) {
				matriculados[f1][f2]=sc.nextInt();
			}
		}
		//Comprobacion
		//for(int f1=0; f1<FILAS; f1++) {
			//System.out.println (cursos[f1]);
			//for (int f2=0; f2<COLUMNAS; f2++) {
				//System.out.println(modulos[f2] +": " +matriculados[f1][f2]);
			//}
			//System.out.println();
		//}
		
		//Alfombra
		for (int f=0; f<2; f++) {
			System.out.print(cursos[f] +"  ");
		}
		System.out.println();
		for (int f1=0; f1<COLUMNAS; f1++) {
			System.out.println(modulos[f1] +"  "+matriculados[0][f1] +"   "+matriculados[1][f1] );
		}
	}
}
