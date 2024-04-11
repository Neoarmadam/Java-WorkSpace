package Actividades_UT4;
//Explica el codigo que viene a continuacion.

public class Actividad_10 {

	public static void main(String[] args) {
		//Declaracion de variables "normales", numeros decinames y naturales.
		
		int i=-3;
		byte b=5;
		float f=1e-10f;
		double d=3.14;
		
		//Declaracion de variables boleadas.
		
		//Comprobacion para saber si la variable "i" es mayor que "i".
		boolean b1 = i>i;
		//Comprobacion para saber si la variable "i" es menor que "b".
		boolean b2 = i<b;
		//Comprobacion para saber si la variable "b" es  menor o igual que "f".
		boolean b3 = b<=f;
		//Comprobacion para saber si la variable "f" es menor o igual a "d".
		boolean b4 = f>=d;
		//Comprobacion para saber si la variable "d" hace el "!=" con 0.
		boolean b5 = d !=0;
		//Comprobacion para saber si la 1 es igual que la variable "f".
		boolean b6 = 1 ==f;
		
		/*
		 * Se estan usando todas las variables boleadas para 
		 * hacer todas cas comprobaciones de indicadas arriba,
		 * ademas de bien escrito explicando las variables o numeros 
		 * que se comprueban si cumpre cierto requisito y el
		 * resultado.
		 */
		System.out.println("b1:" +i+ ">" +i+ "=" +b1);
		System.out.println("b2:" +i+ "<" +b+ "=" +b2);
		System.out.println("b3:" +b+ "<=" +f+ "=" +b3);
		System.out.println("b4:" +f+ ">=" +d+ "=" +b4);
		System.out.println("b5:" +d+ "!=" +0+ "=" +b5);
		System.out.println("b6:" +1+ "==" +f+ "=" +b6);
		
		
	}
}
