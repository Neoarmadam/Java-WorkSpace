package Actividades_UT5;
	/*
	 * Escribe el mismo programa que antes pero ahora el tamaño del vector lo determina un
	 * número N (QUE DEBE SER MAYOR QUE 1) que le pedimos al usuario.
	 */
	import java.util.Scanner;
public class Actividad_2 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int tamvec=0;
		
		System.out.println("Introduce el tamaño del vector");
		do {
			tamvec=sc.nextInt();
			if (tamvec<1) {
				System.out.println("Error, vuelve a intentarlo");
			}
		}while(tamvec<1);
		
		int [] vector= new int[tamvec];
		
		System.out.println("Te voy a pedir "+tamvec +" numeros, introducelos");
		for (int f=0; f<tamvec; f++) {
			vector[f]=sc.nextInt();
		}
		
		System.out.println("Has introducido los siguientes numeros");
		for(int f=0; f<tamvec; f++) {
			System.out.println(vector[f]);
		}
	}
}
