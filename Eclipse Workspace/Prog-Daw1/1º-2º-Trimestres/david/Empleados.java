package david;

public class Empleados {
	private int edad;
	private String nombre;
	
	public Empleados() {
		this.nombre="Juan";
		this.edad=27;
	}
	
	public Empleados(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Empleados [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	public void datosEmp() {
		System.out.println(edad+nombre);
	}
}
