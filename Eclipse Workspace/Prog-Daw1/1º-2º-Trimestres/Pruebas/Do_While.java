package Pruebas;
	import java.util.Scanner;
public class Do_While {
	public static void main (String args[]) {
		int num,contador=0;
		Scanner sc= new Scanner(System.in);
		
		do{
			System.out.println("dame un numero");
			num=sc.nextInt();
			contador=contador+1;
		}while (contador<5);
		System.out.print("ditto");
	}
}
