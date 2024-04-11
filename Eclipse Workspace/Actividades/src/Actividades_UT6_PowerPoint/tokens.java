package Actividades_UT6_PowerPoint;
	import java.util.Scanner;
import java.util.StringTokenizer;
public class tokens {
	public static void main (String args[]) {
		String origen="Hola don Pepito, hola don Jose";
		
		StringTokenizer partes=new StringTokenizer(origen, ",");
		String cad[]=new String[2];
		int i=0;
		while (partes.hasMoreTokens()) {
			System.out.println(partes.nextToken());
		}
		for(int f=0; f<2;f++) {
			System.out.println(cad[f]);
		}
	}
}
