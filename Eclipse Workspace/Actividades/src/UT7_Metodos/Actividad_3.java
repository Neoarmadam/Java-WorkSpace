package UT7_Metodos;

public class Actividad_3 {
	public static void main (String args[]) {
		int mayor=mayor(3,6,9);
		System.out.println(mayor);
	}
	
	static int mayor(int a, int b, int c) {
		int mayor;
		if (a>b && a>c) {
			mayor=a;
		}else {
			if (b<c) {
				mayor=c;
			}else {
				mayor=b;
			}
		}
		return mayor;
	}
}
