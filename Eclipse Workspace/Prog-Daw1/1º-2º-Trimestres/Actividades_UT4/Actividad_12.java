package Actividades_UT4;
//Crea una clase y comprueba si has acertado
public class Actividad_12 {
	public static void main(String args[]) {
		int x,y,z;
		float PI=3.14f;
		
		//1
		boolean b1=((4-2)*(5+1)/2)>2-(4+3);
		System.out.println("1: " +b1);
		
		//2
		boolean b2=(6+3)>8 && (6-1)*2<8 || 2+3==8;
		System.out.println("2: " +b2);
		
		//3
		x=7;
		z=2;
		boolean b3=(1.0<x) && (x<z+7.0);
		System.out.println("3: " +b3);
		
		//4
		x=1;
		y=4;
		z=10;
		//boolean b4=PI*x^2>y||2*PI*x<=z;
		//No arranca
		
		//5
		x=1;
		y=4;
		z=10;
		boolean b5=x>3 && y == 4 || x + y <=z;
		System.out.println("5: " +b5);
		
		//6
		x=1;
		y=4;
		z=10;
		boolean b6=x>3 && (y==4 || x + y <=z);
		System.out.println("6: " +b6);
	}
}
