package Actividades_UT4_PowerPoint;
	/*
	 * Pedir la edad, y altura de 5 alumnos,
	 * mostrar los mayores de 18
	 * y mostrar los que midan mas de 1.75
	 */
	import java.util.Scanner;
public class Actividad_40 {
	public static void main(String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		int año;
		float altura=0;
		int contAño=0;
		int contAlt=0;
		int LIM=5;
		
		System.out.println("Vas a introducir la altura y edad de tus alumnos");
		for(int f=0; f<LIM; f++) {
			System.out.println("Introduce la edad de tu " +(f+1) +" alumno");
			año=sc.nextInt();
			if (año>=18) {
				contAño=contAño+1;
			}
			System.out.println("Ahora introduce su estatura en metros");
			altura=sc.nextFloat();
			if (altura>=1.75f) {
				contAlt=contAlt+1;
			}
		}
		System.out.println("Hay " +contAño +" mayores de edad");
		System.out.println("Y " +contAlt +" que miden mas de 1,75 metros");
	}
}
