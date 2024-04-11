/*
 * Declarar e inicializar una cadena de caracteres. El programa debe pedir al usuario que introduzca una posición 
 * (un número entero) y debe devolver el carácter situado en dicha posición de la cadena de caracteres definida 
 * anteriormente. Si la posición introducida no corresponde a ningún carácter debe indicarlo. Se sale del programa 
 * cuando el usuario mete una posición que no existe en la cadena.
 */
package Actividades_UT6_PowerPoint;
	import java.util.Scanner;
public class Actividad_5 {
	public static void main (String args[]) {
		/**Variables**/
		Scanner sc=new Scanner(System.in);
		String cadena="Mondongo, ta bien";
		final int LIM=cadena.length();
		int posicion;
		boolean error=false;
		
		/**Resolucion**/
		while(error==false) {
			posicion=sc.nextInt();
			if (posicion<1 || posicion>LIM) {
				System.out.println("Error");
				error=true;
			}else {
				System.out.println(cadena.charAt(posicion-1));
			}
		}
		
		
		
	}
}
