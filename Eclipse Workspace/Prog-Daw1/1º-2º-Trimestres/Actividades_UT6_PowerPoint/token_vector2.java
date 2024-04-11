package Actividades_UT6_PowerPoint;
	import java.util.StringTokenizer;
public class token_vector2 {
	public static void main (String args[]) {
		/**Variables**/
		String nombre, edadStr, curso;
		String linea="Neo -*- 21 -*- Daw1º";
		int edad;
		StringTokenizer partes=new StringTokenizer(linea, " -*- ");
		nombre=partes.nextToken();
		edadStr=partes.nextToken();
		curso=partes.nextToken();
		edad=Integer.parseInt(edadStr);
		/**Resolucion**/
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(curso);
	}
}
