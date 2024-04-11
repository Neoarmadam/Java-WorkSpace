package Actividades;
	import java.util.Scanner;
//Pedir un numero y decir si el numero es positivo o negativo
public class EjercicioIf_Scanner {
	public static void main(String args[]) {
		int num;
	
		System.out.println("Introduce un numero");
		Scanner teclado= new Scanner(System.in);
		num=teclado.nextInt();
		if(num<0) {
			System.out.println("Es menor de 0");
		}else {
				if(num==0) {
					System.out.println("Es cero");
				}else {
					
				System.out.println("Es mayor de 0");
				}
			}
		System.out.println("Asta luego");
		teclado.close();
	}	
}
