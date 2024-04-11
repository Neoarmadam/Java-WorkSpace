package UT9_Herencia;
	import java.util.Scanner;
public class Ejer2_Persona extends Ejer2_Mamifero{
	String profesion;
	
	public void pedirPersona() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Cual es la profesion de esta persona?");
		profesion=sc.nextLine();
		//sc.close();
	}
	
	public Ejer2_Persona() {
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Profesion");
		profesion=sc.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() +"\n Ejer2_Persona [profesion=" + profesion + "]";
	}
	/**Get Set**/
	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
}
