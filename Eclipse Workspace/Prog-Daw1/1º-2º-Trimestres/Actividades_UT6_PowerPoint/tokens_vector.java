package Actividades_UT6_PowerPoint;

	import java.util.StringTokenizer;

public class tokens_vector {
	public static void main (String args[]) {
		/**Variables**/
		String origen="Hola don Pepito, hola don Jose";
		StringTokenizer partes=new StringTokenizer(origen, ",");
		String cad[]=new String [partes.countTokens()];
		final int LIM=cad.length;
		
		/**Resolucion**/
		for (int f=0;f<LIM; f++) {
			cad[f]=partes.nextToken();
		}
		for (int f=0;f<LIM; f++) {
			System.out.println(cad[f]);
		}
	}
}
