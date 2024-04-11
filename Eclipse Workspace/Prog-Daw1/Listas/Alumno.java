

import java.io.Serializable;

public class Alumno implements Serializable, Comparable<Object> { //<Alumno>
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int auxId=1;
	int id;
	int edad;
	float altura;
	char grupo;
	String ciclo;
	
	public Alumno(int id, int edad) {
		super();
		this.id=id;
		this.edad = edad;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return ciclo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null || obj.getClass()!=getClass()) { //Comparar para que el objeto que me pasan sean del mismo objeto
			return false;
		}else if(((Alumno) obj).getEdad()==this.edad) {
			return true;
		}
		return false;
	}

	public Alumno(int edad, float altura, char grupo, String ciclo) {
		super();
		this.id=auxId;
		this.edad = edad;
		this.altura = altura;
		this.grupo = grupo;
		this.ciclo = ciclo;
		auxId++;
	}
	
	public int compareTo(Object o) {
		if(this.edad-((Alumno) o).getEdad()<0) {
			return -1;
		}else if (this.edad-((Alumno) o).getEdad()>0) {
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
