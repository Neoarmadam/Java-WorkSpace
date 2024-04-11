package Actividades_UT6_PowerPoint;
 import java.util.Scanner;
 import java.util.StringTokenizer;
public class PracticaTokenizer {
	public static void main (String args[]) {
		/**Variables**/
		Scanner sc=new Scanner(System.in);
		String teclado="", nombre, pesoStr, alturaStr, nombreSel=null;
		int altura, alturaMax=0, contador=0;
		float peso, pesoMed=0;
		StringTokenizer datos;
		String error="*-*";
		
		/**Resolucion**/
		System.out.println("Introduce los datos con el siguiente formato:");
		System.out.println("Nombre<<peso<<altura");
		teclado=sc.nextLine();
		while(pesoMed>-100) {
			if(teclado.equals(error)) {	
				break; 
			}
			datos=new StringTokenizer(teclado, "<");
			nombre=datos.nextToken();
			pesoStr=datos.nextToken();
			alturaStr=datos.nextToken();
			peso=Float.parseFloat(pesoStr);
			altura=Integer.parseInt(alturaStr);
			if (peso>0 && altura>0) {
				pesoMed=pesoMed+peso;
				contador++;
				if(altura>alturaMax) {
					alturaMax=altura;
					nombreSel=nombre;
				}
			}else {
				System.out.println("Error");
			}
			System.out.println("Introduce nuevos datos");
			teclado=sc.nextLine();
		}
		pesoMed=pesoMed/contador;
		System.out.println("La media de los pesos es: " +pesoMed);
		System.out.println("Y la persona mas alta es " +nombreSel +" con " +alturaMax +"cm");
	}
}
