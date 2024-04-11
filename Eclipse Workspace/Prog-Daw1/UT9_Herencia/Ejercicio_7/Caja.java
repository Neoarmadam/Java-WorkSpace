package Ejercicio_7;
	import java.util.Scanner;
public class Caja extends Rectangulo{
	int grosor;

	/**Constructores**/
	public Caja() {
		super();
		Scanner sc= new Scanner(System.in);
		System.out.println("Dame el grosor");
		grosor=sc.nextInt();
	}
	
	public Caja(int ancho, int alto, int grosor) {
		super(ancho, alto);
		this.grosor=grosor;
	}
	
	/**Get/Set**/
	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}
	
	/**Volumen**/
	public int volumen() {
		return grosor*alto*ancho;
	}
	
	/**ToString**/
	@Override
	public String toString() {
		return super.toString() +"\n Caja [grosor=" + grosor + "]";
	}
	
	
}
