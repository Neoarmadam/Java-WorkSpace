package UT8_Objetos;
	import java.util.Scanner;
public class Empleado {
	String nombre;
	float salario;


	public void pedirDatosEmpleado() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vamos a introducir los datos del empleado");
		System.out.println("Introduce el nombre");
		nombre=sc.next();
		System.out.println("Ahora introduce el salario");
		salario=sc.nextFloat();
	}

	public void visualizarDatosEmpleado() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Salario: "+salario);
	}

	public String getNombre() {
		return nombre;
	}

	public float getSalario() {
		return salario;
	}


}
