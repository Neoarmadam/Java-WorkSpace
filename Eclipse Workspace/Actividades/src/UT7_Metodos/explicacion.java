package UT7_Metodos;

public class explicacion {
	public static void main (String args[]) {
		float area=circulo(4);
		
		imprimir1("Me corro");
		aMayusculas("Me corro mucho");
		circulo(4);
		System.out.println(area);
	}
	
	static void aMayusculas(String cad) {
		String result;
		result=cad.toUpperCase();
		System.out.println(result);
	}
	static void imprimir() {
		System.out.println("Hola desde el metodo");
	}
	static void imprimirmay() {
		String saludo="Hola desde el metodo";
		System.out.println(saludo.toUpperCase());
	}
	static void imprimir1(String saludo) {
		System.out.println(saludo);
	}
	static float circulo(float r) {
		final float PI=3.14f;
		float result;
		result=r*r*PI;
		return result;
		//System.out.println(result);
	}
}
