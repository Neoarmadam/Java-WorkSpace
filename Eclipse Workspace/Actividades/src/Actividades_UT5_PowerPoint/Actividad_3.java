package Actividades_UT5_PowerPoint;
	//Declarar una tabla de 4 institutos y 
public class Actividad_3 {
	public static void main (String args[]) {
		int [][] alumnos= new int [4][5];
		
		alumnos[0][0]=10;
		alumnos[0][1]=20;
		alumnos[0][2]=30;
		alumnos[0][3]=40;
		alumnos[0][4]=50;
		
		int edades[][]= {{1,2,3,4},{10,11,12,13}};
		
		System.out.println(edades.length );
		System.out.println(edades[0].length ); //columnas
		System.out.println(edades[1][2]);
	}
}
