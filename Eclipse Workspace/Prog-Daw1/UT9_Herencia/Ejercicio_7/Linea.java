package Ejercicio_7;
	import java.util.Scanner;
public class Linea {
	private int ancho;
	
	/**Constructores**/
	public Linea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el ancho");
		ancho=sc.nextInt();
	}
	
	public Linea(int ancho) {
		this.ancho=ancho;
	}
	
	/**Get/Set**/
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**ToString**/
	@Override
	public String toString() {
		return "Linea [ancho=" + ancho + "]";
	}
	
}
