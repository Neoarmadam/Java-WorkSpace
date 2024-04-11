package Actividades;
//Pedimos 3 numeros y damos el menor

	import java.util.Scanner; //Importamos el Scanner
public class tresnum_mostrarmenor {
	public static void main (String args[]) {
		//Inicializamos variables
		int num1, num2, num3, numfin;
		
		//Aqui pedimos las variables por Scanner
		Scanner teclado= new Scanner(System.in);
		System.out.println("Te voy a pedir tres numeros");
		System.out.println("Dame el primero");
		num1=teclado.nextInt();
		System.out.println("Ahora dame el segundo");
		num2=teclado.nextInt();
		System.out.println("Y ahora dame el ultimo numero");
		num3=teclado.nextInt();
		teclado.close();
		
		//Comprobamos el numero mas pequeño
		if (num1<num2) {
			if(num1<num3) {
				numfin=num1;
			}else {
				numfin=num3;
			}
		}else {
			if (num2<num3) {
				numfin=num2;
			}else {
				numfin=num3;
			}
		}
		//Escribimos el numero pequeño
		System.out.println("El numero mas pequeños es " +numfin);
	}
}
