package UT9_Herencia;
	import java.util.Scanner;
public class Ejer2_Animal {
	/**Variables del objeto Animal**/
	int numCrias;
	
	/**Constructor**/
	public Ejer2_Animal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce numero de crias");
		numCrias=sc.nextInt();
	}
	/**Pedir datos**/
	public void pedirAnimal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el numero de crias de este animal");
		numCrias=sc.nextInt();
		//sc.close();
	}
	
	@Override
	public String toString() {
		return "Ejer2_Animal [numCrias=" + numCrias + "]";
	}

	/**Get Set**/
	public int getNumCrias() {
		return numCrias;
	}

	public void setNumCrias(int numCrias) {
		this.numCrias = numCrias;
	}
	
}
