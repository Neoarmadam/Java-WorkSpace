package UT8_Objetos;

public class Racional_2 {
	private int numerador, denominador;
	
	
	/**Constructores**/
	public Racional_2() {
		numerador=0;
		denominador=0;
	}
	public Racional_2(int num, int den) {
		numerador=num;
		denominador=den;
	}
	
	/**Imprimir Fraccion**/
	public void impriFrac() {
		System.out.println(numerador);
		System.out.println("---");
		System.out.println(denominador);
	}
	
	/**Simplificar Fraccion**/
	public void simpFrac() {
		int menor;
		int maxComDiv=1;
		if (denominador>=numerador) { //Comprobar cual es el menor para las vueltas del bucle
			menor=numerador;
		}else {
			menor=denominador;
		}
		for(int f=1; f<=menor; f++) {
			if(denominador%f==0 && numerador%f==0) {
				maxComDiv=f;
			}
		}
		denominador=denominador/maxComDiv;
		numerador=numerador/maxComDiv;
	}
	
	/**Imprimir Formateado**/
	public void impFormFrac() {
		float num=numerador, den=denominador;
		
		System.out.printf("%.2f", num);
		System.out.println();
		System.out.println("----");
		System.out.printf("%.2f", den);
	}
	/**Sumar Fraccion**/
	public void sumFrac(int num, int den) {
		num=num*denominador;
		numerador=numerador*den;
		denominador=denominador*den;
		numerador=numerador+num;
	}
	/**Restar Fraccion**/
	public void restFrac(int num, int den) {
		num=num*denominador;
		numerador=numerador*den;
		denominador=denominador*den;
		numerador=numerador-num;
	}
	
	/**Multiplicar Fraccion**/
	public void multFrac(int num, int den) {
		numerador=numerador*num;
		denominador=den*denominador;
	}
	
	/**Dividir Fraccion**/
	public void divFrac(int num, int den) {
		numerador=numerador*den;
		denominador=denominador*num;
	}
}

