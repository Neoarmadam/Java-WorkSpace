package Actividades_UT6_PowerPoint;

public class indexOf {
	public static void main(String args[]) {
		/**Variables**/
		String cadena1="hola mondo";
		char buscando='o';
		int posicion=0;
		final int LIM= cadena1.length();
		
		
		/**Resolucion**/
		while(posicion!=LIM) {
			posicion=cadena1.indexOf(buscando , posicion);
			System.out.println(posicion);
			posicion++;
		}
		
		}
}
