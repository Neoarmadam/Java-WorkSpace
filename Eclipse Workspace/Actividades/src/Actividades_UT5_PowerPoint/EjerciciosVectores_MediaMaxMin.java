package Actividades_UT5_PowerPoint;
	import java.util.Scanner;
public class EjerciciosVectores_MediaMaxMin {
	public static void main (String args[]) {
		//Variables
		Scanner sc= new Scanner(System.in);
		int [] num=new int [5];
		int numMax, numMin;
		float media=0;
		final int LIM=num.length;
		
		//Resolucion
		System.out.println("Te voy a pedir " +num.length +" numeros");
		for (int f1=0; f1<LIM; f1++) {
			System.out.println("Introduce un numero");
			num[f1]=sc.nextInt();
		}
		sc.close();
		numMin=num[0];
		numMax=num[0];
		for (int f2=0; f2<LIM; f2++) {
			if (num[f2]>numMax){
				numMax=num[f2];
			}
			if(num[f2]<numMin) {
				numMin=num[f2];
			}
			media=media+num[f2];
		}
		media=media/num.length;
		System.out.println("La media de los numeros es " +media);
		System.out.println("El numero maximo es " +numMax +" y el minimo " +numMin);
	}
}
