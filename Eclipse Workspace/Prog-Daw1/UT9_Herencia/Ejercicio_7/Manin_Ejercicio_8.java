package Ejercicio_7;
	import java.util.Scanner;
public class Manin_Ejercicio_8 {
	public static void main(String[] args) {
		Caja caja=new Caja(0,0,0);
		
		caja=pedirCaja(caja);
		
		System.out.println(caja.getAlto());
		System.out.println(caja.volumen());
	}
	
	
	public static Caja pedirCaja(Caja caja) {
		int ancho, alto, grosor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el ancho");
		ancho=sc.nextInt();
		System.out.println("Dame el alto");
		alto=sc.nextInt();
		System.out.println("Dame el grosor");
		grosor=sc.nextInt();
		return caja=new Caja(ancho, alto, grosor);
	}
}
