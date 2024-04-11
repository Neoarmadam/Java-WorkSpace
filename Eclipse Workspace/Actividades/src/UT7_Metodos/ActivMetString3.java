package UT7_Metodos;
	import java.util.Scanner;
public class ActivMetString3 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		boolean salir=false;
		float result;
		int menu=0;
		float num1=0, num2=0, num3=0;
		
		while(salir==false) {
			menu=escribirMenu(menu, sc);
			switch(menu) {
			case 1:
				menu2("Circulo");
				menu=sc.nextInt();
				switch(menu) {
				case 1:
					pedirRadio(num1,sc);
					result=areaCirculo(num1);
					System.out.println(result);
					break;
				case 2:
					pedirRadio(num1,sc);
					result=perimetroCirculo(num1);
					System.out.println(result);
					break;
				default:
					System.out.println("Salir");
					break;
				}
				break;
			case 2:
				menu2("Cuadrado");
				menu=sc.nextInt();
				switch(menu) {
				case 1:
					System.out.println("Dame el lado del Cuadrado");
					num1=sc.nextFloat();
					result=areaCuadrado(num1);
					System.out.println(result);
					break;
				case 2:
					System.out.println("Dame el lado del Cuadrado");
					num1=sc.nextFloat();
					result=perimetroCuadrado(num1);
					System.out.println(result);
					break;
				default:
					System.out.println("Salir");
					break;
				}
			case 3:
				menu2("Triangulo");
				menu=sc.nextInt();
				switch(menu) {
				case 1:
					System.out.println("Dame la base y la altura del triangulo");
					num1=sc.nextFloat();
					num2=sc.nextFloat();
					result=areaTriangulo(num1,num2);
					System.out.println(result);
					break;
				case 2:
					System.out.println("Dame los lados del triangulo");
					num1=sc.nextFloat();
					num2=sc.nextFloat();
					num3=sc.nextFloat();
					result=perimetroTriangulo(num1, num2, num3);
					System.out.println(result);
					break;
				default:
					System.out.println("Salir");
					break;
				}
			case 4:
				salir=true;
				break;
			default:
				System.out.println("Error");
				}
			
			
		}
		
	}
	static float pedirRadio(float num1, Scanner sc) {
		System.out.println("Dame el radio del circulo");
		num1=sc.nextFloat();
		return num1;
	}
	static void menu2(String mensaje) {
		System.out.println("----"+mensaje+"----");
		System.out.println("Area: 1");
		System.out.println("Perimetro: 2");
		System.out.println("Salir: otra opcion");
	}
	static int escribirMenu(int menu, Scanner sc) {
		System.out.println("------Elija una opcion------");
		System.out.println("Circulo: 1");
		System.out.println("Cuadrado: 2");
		System.out.println("Triangulo: 3");
		System.out.println("Salir: 4");
		menu=sc.nextInt();
		return menu;
	}
	
	static float areaCirculo(float radio) {
		final float PI=3.1416f;
		float result=radio*radio*PI;
		
		return result;
	}
	static float perimetroCirculo(float radio) {
		final float PI=3.1416f;
		float result=2*PI*radio;
		return result;
	}
	
	static float areaCuadrado(float lado){
		float result=lado*lado;
		return result;
	}
	static float perimetroCuadrado(float lado){
		float result=lado*4;
		return result;
	}
	
	static float areaTriangulo(float base, float altura) {
		float result=base*altura/2;
		return result;
	}
	static float perimetroTriangulo(float lado1, float lado2, float lado3) {
		float result=lado1+lado2+lado3;
		return result;
	}
}
