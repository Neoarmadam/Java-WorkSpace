package Pruebas;
	import java.util.Scanner;
public class PruebaWhile {
	public static void main(String[]args) {
		int suma,num;
		suma=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime un numero, si me das el 0 termino");
		num=sc.nextInt();
		
		while(num!=0){
			suma=suma+num;
			System.out.println(suma);
			num=sc.nextInt();
		}
	}

}
