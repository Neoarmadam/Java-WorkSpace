package Actividades;
/*
 * Pedir un numero y dar el dia de la semana correspondiente
 */
	import java.util.Scanner;
public class NumSemana {
	public static void main (String args []) {
		//Declaracion de variables
		int num;
		String dia="hola";
		//Pedimos la variable
		System.out.println("Introduce un numero entre 1 y 7 y te dire el dia de la semana");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		sc.close(); 
		
		//Comprobamos el numero que nos han dado
		switch(num){
			case 1:
				dia= "Lunes";
				break;
			case 2:
				dia= "Martes";
				break;
			case 3:
				dia= "Miercoles";
				break;
			case 4:
				dia= "Jueves";
				break;
			case 5:
				dia="Viernes";
				break;
			case 6: 
				dia = "Sabado";
				break;
			case 7:
				dia= "Domingo";
				break;
			default:
				dia= "Numero no valido";
				break;
		}
		System.out.println("Elegiste " +dia);
	}
}
