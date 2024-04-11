package Actividades_UT4;
//Explica el codigo que viene a continuacion.
public class Actividad_11 {

	public static void main(String []arg) {
		//Declaracion de varibles
		int i=-3;
		float a=5, b=10, c=20;
		boolean res1,res2;
		
		//Comparacion de boleada, si se cumpre una sirve
		res1=(a<b) || (b<c);
		//Comparacion boleada, se tienen que cumplir las dos
		res2=(a==b) && (b<c);
		//Escribibos el resultado de las boleadas
		System.out.println("El resultado del operador OR " +res1);
		System.out.println("El resultado del operador AND " +res2);
		
	}
}
