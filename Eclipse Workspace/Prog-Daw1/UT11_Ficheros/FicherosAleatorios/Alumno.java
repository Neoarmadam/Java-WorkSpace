package FicherosAleatorios;

public class Alumno {
	int id;
	int edad;
	float altura;
	char grupo;
	String ciclo;
	
	public Alumno(int id, int edad, float altura, char grupo, String ciclo) {
		super();
		this.id=id;
		this.edad = edad;
		this.altura = altura;
		this.grupo = grupo;
		this.ciclo = ciclo;
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
	
	
}
