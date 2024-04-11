package ejercicio1;

public class Profesor extends Persona{
	private float sueldo;
	private String departamento;
	private final static long serialVersionUID= 1L;
	
	public Profesor() {
		super();
		this.sueldo = 0;
		this.departamento = null;
	}
	
	public Profesor(int identificador, int edad, String nombre,float sueldo, String departamento) {
		super(identificador,edad,nombre);
		this.sueldo = sueldo;
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return "Profesores id= ["+ this.getIdentificador()+"] , edad= ["+this.getEdad()+"], nombre= ["+this.getNombre()+"], sueldo= ["+this.getSueldo()+"], departamento= ["+this.getDepartamento()+"]";
		
	}

	/***Get/Set***/
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
