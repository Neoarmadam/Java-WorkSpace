package Actividades_UT4_PowerPoint;
	//Parar cuando se de nota incorrecta
	import java.util.Scanner;
public class Actividad_33 {
	public static void main(String args []) {
		Scanner sc= new Scanner(System.in);
		int notas, aprobados=0, LIM=10;
		
		System.out.println("Vas a introducir las notas de tus alumnos y vamos a comprobar cuentos aprueban");
		notas=sc.nextInt();
			while (notas>=0 && notas<=10) {
				if (notas>=5) {
					aprobados=aprobados+1;
				}
				System.out.println("Introduce la nota");
				notas=sc.nextInt();
			}
		System.out.println("Han aprobado " +aprobados +" alumnos");
	}
}

