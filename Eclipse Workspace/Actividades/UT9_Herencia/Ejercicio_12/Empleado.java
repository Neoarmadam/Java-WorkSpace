package Ejercicio_12;
	import java.util.Scanner;
public class Empleado {
	static final private String NOMBREEMPRESA="Michelin";
	private String nombre;
	private int edad;
	static private int sueldoBase=1000;
	private int incrSueldo;
	
	public Empleado(String setNombre, int setEdad, int setIncrSueldo) {
		nombre=setNombre;
		edad=setEdad;
		incrSueldo=setIncrSueldo;
	}
	public Empleado() {
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("Dame el nombre");
		nombre=sc.nextLine();
		System.out.println("Dame la edad");
		edad=sc.nextInt();
		System.out.println("Dame el incremento/decremento del sueldo");
		incrSueldo=sc.nextInt();
	}
	/**Get/Set**/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIncrSueldo() {
		return incrSueldo;
	}

	public void setIncrSueldo(int incrSueldo) {
		this.incrSueldo = incrSueldo;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombreEmpresa=" + NOMBREEMPRESA + ", nombre=" + nombre + ", edad=" + edad + ", sueldoBase="
		    + sueldoBase + ", incrSueldo=" + incrSueldo + "]";
	}
	
	
}
