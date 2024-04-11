package Ejercicio_21;

public class Empleado {
	private String nombre;
	private int numSegSocial;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, int numSegSocial) {
		super();
		this.nombre=nombre;
		this.numSegSocial=numSegSocial;
	}
	
	
	/********Get/Set*********/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumSegSocial() {
		return numSegSocial;
	}
	public void setNumSegSocial(int numSegSocial) {
		this.numSegSocial = numSegSocial;
	}
	
}
