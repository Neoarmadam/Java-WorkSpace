package UT9_Herencia;

import java.util.Scanner;

public class Ejer1_Jefe extends Ejer1_Empleados {
	/**Variables del objeto Jefes**/
	private String titulo;
	private String departamento;
	
	/**Constructor**/
	public Ejer1_Jefe(String titulo, String departamento) {
		super();
		this.titulo = titulo;
		this.departamento = departamento;
	}
	public Ejer1_Jefe(String titulo, String departamento, String nombre, int sueldo) {
		super(nombre, sueldo);
		this.titulo = titulo;
		this.departamento = departamento;
	}
	public Ejer1_Jefe() {
		super();
		Scanner sc=new Scanner(System.in);
		titulo=sc.nextLine();
		departamento=sc.nextLine();
		
	}
	/** Get/Set **/
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDepartemento() {
		return departamento;
	}

	public void setDepartemento(String departemento) {
		this.departamento = departemento;
	}

	/**To String**/
	@Override
	public String toString() {
		/*
		*return "Ejer1_Jefe [titulo=" + titulo + ", departamento=" + departamento + ", Nombre=" + getNombre()
		*   + ", Sueldo=" + getSueldo() + "]";
		*/
		return super.toString() +"\n Ejer1_Jefe [titulo=" + titulo + ", departamento=" + departamento + "]";
	}
	
}
