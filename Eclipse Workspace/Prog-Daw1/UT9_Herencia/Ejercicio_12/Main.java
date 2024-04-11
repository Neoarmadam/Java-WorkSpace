package Ejercicio_12;

public class Main {
	public static void main(String[] args) {
		Empleado jefe=new Empleado("David", 36, 10);
		System.out.println(jefe.toString());
		jefe.setNombre("Alvaro");
		System.out.println(jefe.toString());
	}
}
