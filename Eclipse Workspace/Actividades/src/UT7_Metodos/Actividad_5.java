package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_5 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);	
		int num1, num2, resto;
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		resto=resto(num1, num2);
		if (resto==0) {
			System.out.println("El menor es divisor del mayor");
		}else {
			System.out.println("El menor NO es divisor del mayor");
		}
	}

	static int resto(int num1, int num2) {
		int resto;
		if(num1>num2) {
			resto=num1%num2;
		}else {
			resto=num2%num1;
		}
		return resto;
	}
}
