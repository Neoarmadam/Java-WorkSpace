package Ejercicio_12;
	import java.util.Scanner;
	
public class Jefe extends Empleado{
	String nombreDep;
	int plusSueldo;
	
	public Jefe() {
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el nombre departamento");
		nombreDep=sc.nextLine();
		System.out.println("Dame el plus del sueldo");
		plusSueldo=sc.nextInt();
	}
	
	/**Get/Set**/
	public String getNombreDep() {
		return nombreDep;
	}

	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	public int getPlusSueldo() {
		return plusSueldo;
	}

	public void setPlusSueldo(int plusSueldo) {
		this.plusSueldo = plusSueldo;
	}

	@Override
	public String toString() {
		return super.toString() +"\n Jefe [nombreDep=" + nombreDep + ", plusSueldo=" + plusSueldo + "]";
	}
	
}
