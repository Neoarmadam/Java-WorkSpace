package Actividades_UT6_PowerPoint;

public class CompararCadenas {
	public static void main(String args[]) {
		/**Variables**/
		String cadena1="hola mundo";
		String cadena2="hola mundo";
		boolean iguales=true;
		final int LIM=cadena1.length();
		
		/**Resolucion**/
		if (cadena1.length()==cadena2.length()) {
			for (int f=0; f<LIM; f++) {
				if (cadena1.charAt(f)!=cadena2.charAt(f)) {
					iguales=false;
					break;
				}
			}
		}else {
			iguales=false;
		}
		if (iguales==true) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		/**Resolucion buena**/
		if (cadena1.equals(cadena2)) {
			//Hace lo anterior
			//equalsIgnoreCase() *ignora mayusculas
		}

	}

}
