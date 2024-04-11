package ejercicio1;

public class Alumno extends Persona{
	private String ciclo;
	private final static long serialVersionUID= 1L;
	
	public Alumno(int identificador, int edad, String nombre, String ciclo) {
		super(identificador, edad, nombre);
		this.ciclo = ciclo;
	}
	
	public Alumno() {
		super();
		this.ciclo = null;
	}
	
	
	@Override
	public String toString() {
		return "Alumnos id= ["+ this.getIdentificador()+"] , edad= ["+this.getEdad()+"], nombre= ["+this.getNombre()+"], ciclo= ["+this.getCiclo()+"]";
	}

	/***Get/Set***/
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
}
