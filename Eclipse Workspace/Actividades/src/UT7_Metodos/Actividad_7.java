package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_7 {
	public static void main (String args[]) {
		int num=pedirInt();
		tablaMult(num);
	}
	static int pedirInt() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		return num;
	}
	static void tablaMult(int num) {
		for(int f=1; f<=10; f++) {
			System.out.println(num*f);
		}
	}
}
