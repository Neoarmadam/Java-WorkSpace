package Ejercicio_7;
	import java.util.Scanner;
public class Rectangulo extends Linea {
	int alto;
	
	/**Constructores**/
	public Rectangulo() {
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el alto");
		alto=sc.nextInt();
	}
	
	public Rectangulo(int ancho, int alto) {
		super(ancho);
		this.alto=alto;
	}
	
	/**Get/Set**/
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	/**Area**/
	public int area() {
		return alto*this.getAncho();
	}
	/**ToString**/
	@Override
	public String toString() {
		return super.toString() +"\n Rectangulo [alto=" + alto + "]";
	}
	
}
