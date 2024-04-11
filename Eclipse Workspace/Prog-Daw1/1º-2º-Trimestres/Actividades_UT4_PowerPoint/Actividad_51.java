package Actividades_UT4_PowerPoint;
	/*
	 * Escribe un programa que lea varios caracteres hasta que se introduzca un asterisco.
	 * Hay que visualizar cuántos caracteres de los leídos estaban entre las letras 
	 * mayúsculas ‘I’ y ‘P’, ambas inclusive
	 */
	import java.util.Scanner;
public class Actividad_51 {
	public static void main (String args[]) {
		//Variables
		Scanner sc = new Scanner(System.in);
		char letra;
		char lim='*';
		int contador=0;
		
		do {
			letra=sc.next().charAt(0);
			switch(letra) {
			case 'I','J','K','L','M','N','O','P': // 'I'<letra<'P'= (>=I && <=P)
				contador+=1;
				break;
			
			//Forma con If
			/*
			 * if (letra>='I' && letra<='P'{
			 * contador+=1;
			 * }
			 */
			}
		}while (letra!=lim);
			System.out.println(contador);
	}
}
