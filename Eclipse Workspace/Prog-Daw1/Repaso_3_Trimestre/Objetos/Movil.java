package Objetos;

import java.io.Serializable;

public class Movil implements Serializable{
	String modelo;
	String marca;
	int ram;
	String procesador;
	
	public Movil() {
		super();
	}
	
	public Movil(String modelo, String marca, int ram, String procesador) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ram = ram;
		this.procesador = procesador;
	}

	
	@Override
	public String toString() {
		return "Movil [modelo=" + modelo + ", marca=" + marca + ", ram=" + ram + ", procesador=" + procesador + "]";
	}

	/***Get/Set***/
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
}
