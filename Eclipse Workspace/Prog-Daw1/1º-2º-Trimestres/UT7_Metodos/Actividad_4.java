package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_4 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		System.out.println(sumar(num));
		
	}
	
	static int sumar(int num) {
		int result=0;
		for(int f=0; f<=num; f++) {
			result+=f;
		}
		return result;
		
	}
}
