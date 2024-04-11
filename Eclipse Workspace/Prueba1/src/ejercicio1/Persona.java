package ejercicio1;

import java.io.Serializable;

public class Persona implements Serializable{
	final static long serialVersionUID= 1L;
	private int identificador;
	private int edad;
	private String nombre;
	
	public Persona() {
		super();
		this.identificador = 0;
		this.edad = 0;
		this.nombre = null;
	}
	
	public Persona(int identificador, int edad, String nombre) {
		super();
		this.identificador = identificador;
		this.edad = edad;
		this.nombre = nombre;
	}
	
	/***Get/Set***/
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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
	
}
