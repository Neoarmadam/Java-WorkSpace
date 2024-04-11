package Actividades_UT5_PowerPoint;
	import java.util.Scanner;
public class Actividad_2 {
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		String [] modulo= {"Sistemas Informaticos", "Bases de Datos",
				"Programacion", "Lenguajes de marcas",
				"Entornos de desarrollo", "Acceso a datos"};
		int [] matriculadosmodulos=new int [6];
		int suma=0;
		int media;
		/*
		 *matriculadosmodulos[0]=21;
		 *matriculadosmodulos[1]=17;
		 *matriculadosmodulos[2]=30;
		 *matriculadosmodulos[3]=14;
		 *matriculadosmodulos[4]=12;
		 *matriculadosmodulos[5]=25;
		 */
		for (int f1=0; f1<matriculadosmodulos.length; f1++) {
			System.out.println("Alumnos matriculados en " +modulo[f1]);
			matriculadosmodulos[f1]=sc.nextInt();
			
		}
		
		
		for (int f=(modulo.length-1); f>=0; f--) {
			System.out.print(modulo[f] +": ");
			System.out.println(matriculadosmodulos[f]);
		}
		
		for (int f3=0; f3<modulo.length; f3++) {
			suma=suma+matriculadosmodulos[f3];
		}
		System.out.println("La suma es: " +suma);
		media=suma/modulo.length;
		System.out.println("la media es: " +media);
	}
}
