package Ejercicio_9;
	import java.util.Scanner;
public class Ejer1_Empleados {
	/**Variables del objeto Empleados**/
	private String nombre;
	private int sueldo;
	/**Constructor**/
	public Ejer1_Empleados(String nombre, int sueldo){
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	public Ejer1_Empleados(String nombre){
		this.nombre=nombre;
	}
	public Ejer1_Empleados(){
		Scanner sc=new Scanner(System.in);
		nombre=sc.nextLine();
		sueldo=sc.nextInt();
	}
	
	/** Get/Set **/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		if (sueldo>0) {
			this.sueldo = sueldo;
		}else {
			System.out.println("Sueldo debe ser positivo");
		}
		
	}
	
	/**To String**/
	@Override
	public String toString() {
		return "Ejer1_Empleados [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
}
