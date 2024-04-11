package Actividades_UT5_PowerPoint;
	import java.util.Scanner;
public class Actividad_4_2 {
	public static void main (String args[]) {
		//Variables
		final int FILAS=3, COLUMNAS=4;
		int vector []=new int[5];
		
		int tabla [][]=new int [FILAS][COLUMNAS];
			
		
		for (int fil=0; fil<FILAS; fil++) {
			for (int col=0; col<COLUMNAS; col++) {
				tabla[fil][col]=10*fil+col;
				System.out.print(tabla[fil][col]+", ");
			}
			
			System.out.println();
		}
		float mediafull=0;
		for (int fil=0; fil<FILAS; fil++) {
			for (int col=0; col<COLUMNAS; col++) {
				mediafull=mediafull+tabla[fil][col];
				
			}
		}
	
		System.out.printf( "%.2f", mediafull/(COLUMNAS*FILAS));
		System.out.println();
		
		
		/*********************esto no********************/
		System.out.println("Que fila calculamos bb?");
		Scanner sc=new Scanner (System.in);
		int pregunta1;
		pregunta1=sc.nextInt();
		
		while (pregunta1>=20 || pregunta1<0) {
			System.out.println("Error, solo hay " +FILAS +" filas");
			pregunta1=sc.nextInt();
		}
		int media=0;
		for (int col=0; col<COLUMNAS; col++) {
			media=media+tabla[pregunta1][col];
			
		}
		System.out.println(media/COLUMNAS);
	}
}
