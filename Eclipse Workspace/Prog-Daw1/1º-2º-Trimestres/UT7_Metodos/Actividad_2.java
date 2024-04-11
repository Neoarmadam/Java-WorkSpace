package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_2 {
	public static void main (String args[]) {
		float num1=pedirFloat();
		float num2=pedirFloat();
		System.out.println(num1 +" "+num2);
	}
	static float pedirFloat() {
		Scanner sc =new Scanner(System.in);
		float a =sc.nextFloat();
		sc.nextLine();
		return a;
		
	}
}
