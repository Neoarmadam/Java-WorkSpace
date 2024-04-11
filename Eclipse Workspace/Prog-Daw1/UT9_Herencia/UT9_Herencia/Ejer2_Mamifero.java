package UT9_Herencia;
	import java.util.Scanner;
public class Ejer2_Mamifero extends Ejer2_Animal {
	/**Variables del objeto Mamifero**/
	int numHuesos, numExtremidades;
	
	/**Constructor**/
	public Ejer2_Mamifero() {
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Numero de huesos");
		numHuesos=sc.nextInt();
		numExtremidades=4;
	}

	public void pedirMamifero() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el numero de crias de este mamifero");
		numCrias=sc.nextInt();
		System.out.println("Introduce su numero de huesos");
		numHuesos=sc.nextInt();
		System.out.println("Introduce su numero de extremidades");
		numExtremidades=sc.nextInt();
		//sc.close();
	}
	
	@Override
	public String toString() {
		return super.toString() +"\n Ejer2_Mamifero [numHuesos=" + numHuesos + ", numExtremidades=" + numExtremidades + ", numCrias=" + numCrias
		    + "]";
	}

	/**Get Set**/
	public int getNumHuesos() {
		return numHuesos;
	}

	public void setNumHuesos(int numHuesos) {
		this.numHuesos = numHuesos;
	}

	public int getNumExtremidades() {
		return numExtremidades;
	}

	public void setNumExtremidades(int numExtremidades) {
		this.numExtremidades = numExtremidades;
	}
	
}
