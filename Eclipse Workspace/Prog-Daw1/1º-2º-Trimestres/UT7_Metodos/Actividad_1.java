package UT7_Metodos;

public class Actividad_1 {
	public static void main (String args[]) {
		int num1, num2;
		num1=5;
		num2=2;
		int suma=suma(num1,num2);
		int resta=resta(num1, num2);
		int mult=mult(num1,num2);
		int div=div(num1, num2);
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(mult);
		System.out.println(div);
		
	}
	
	static int suma(int num1, int num2) {
		return num1+num2;
	}
	static int resta(int num1, int num2) {
		return num1-num2;
	}
	static int mult(int num1, int num2) {
		return num1*num2;
	}
	static int div (int num1, int num2) {
		
		if(num2==0) {
			return 9999;
		}
		return num1/num2;
	}
}
