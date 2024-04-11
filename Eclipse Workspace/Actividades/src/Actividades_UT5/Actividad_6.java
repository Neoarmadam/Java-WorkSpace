package Actividades_UT5;
	/*
	 * Escribe un programa que se encargue de crear y cargar una matriz con n�meros decimales
	 * con datos que se van a insertar a trav�s del teclado. El programa pedir� al usuario el
	 * n�mero de filas y el n�mero de columnas (todas las filas tienen el mismo n�mero de
	 * columnas). Una vez creada y cargada la matriz, se mostrar�n por pantalla por filas todos
	 * los valores.
	 */
	import java.util.Scanner;
public class Actividad_6 {
	public static void main (String args) {
		Scanner sc=new Scanner(System.in);
		int filas, columnas;
		//int[]decimales;
		
		System.out.println("Te voy a pedir las filas y columnas de la tabla");
		System.out.println("Introduce las filas");
		filas=sc.nextInt();
		System.out.println("Introduce las columnas");
		columnas=sc.nextInt();
		
		//decimales=new float[filas][columnas];
		float [][]decimales = new float [filas][columnas];
		
		for(int f1=0; f1<filas; f1++) {
			System.out.println("Vamos a rellenar la fila " +(f1+1));
			for(int f2=0; f2<columnas; f2++) {
				decimales[f1][f2]=sc.nextFloat();
			}
		}
		for (int f1=0; f1<filas; f1++) {
			for (int f2=0; f2<columnas; f2++) {
				System.out.print(decimales[f1][f2]);
			}
			System.out.println();
		}
	}
}
