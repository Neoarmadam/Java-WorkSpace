package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_6 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		float celsius;
		celsius=sc.nextFloat();
		System.out.println(grados(celsius));
	}
	
	static float grados (float c) {
		float f;
		f=c*1.8f+32;
		return f;
	}
}
