package Actividades_UT6_PowerPoint;

public class compareTo {
	public static void main (String args[]) {
		String cadena1="aa";
		String cadena2="Aa";
		int valor;
		
		valor=cadena1.compareToIgnoreCase(cadena2);
		System.out.println(valor);
	}
}
