package Ejemplos;

import java.io.Serializable;

public class Alumno1 implements Serializable, Comparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int id;
	int edad;
	float altura;
	char grupo;
	String ciclo;
	
	public Alumno1(int id, int edad) {
		super();
		this.id=id;
		this.edad = edad;
	}
	
	public Alumno1(int id, int edad, float altura, char grupo, String ciclo) {
		super();
		this.id=id;
		this.edad = edad;
		this.altura = altura;
		this.grupo = grupo;
		this.ciclo = ciclo;
	}
	
	public int compareTo(Object o) {
		if(this.edad-((Alumno1) o).getEdad()<0) {
			return -1;
		}else if (this.edad-((Alumno1) o).getEdad()>0) {
			return 1;
		}else {
			return 0;
		}
	}
	public int getId() {
		return id;
	}
	public int getEdad() {
		return edad;
	}
	public float getAltura() {
		return altura;
	}
	public char getGrupo() {
		return grupo;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", edad=" + edad + ", altura=" + altura + ", grupo=" + grupo + ", ciclo=" + ciclo
				+ "]";
	}
	
	
}
