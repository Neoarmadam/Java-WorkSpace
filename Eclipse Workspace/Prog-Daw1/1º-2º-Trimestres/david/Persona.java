package david;

public class Persona {
	private int edad;
	private double altura;
	private double peso;
	private String nombre;
	private String ciudad;
	private String dni;
	
	// METODO CONSTRUCTOR
	public Persona(int edad, double altura, double peso, String nombre, String ciudad, String dni) {
		this.edad=edad;
		this.altura=altura;
		this.peso=peso;
		this.nombre=nombre;
		this.ciudad=ciudad ;
		this.dni=dni;
	}
	
	/*Constructor que si no me dan la ciudad , esta sea por defecto Palencia */
	
	public Persona(int edad, double altura, double peso, String nombre, String dni) {
		this.edad=edad;
		this.altura=altura;
		this.peso=peso;
		this.nombre=nombre;
		this.ciudad="Palencia";
		this.dni=dni;
		}
	
	/*Constructor que me reciba el nombre y el dni los campos númericos a 0 y la ciudad Palencia*/
	
	public Persona(String nombre, String dni) {
		this.edad=0;
		this.altura=0;
		this.peso=0;
		this.nombre=nombre;
		this.ciudad="Palencia";
		this.dni=dni;
		}
	
	/* Constructor por defecto*/
	
	public Persona() {
		this.edad=0;
		this.altura=0;
		this.peso=0;
		this.nombre=null;
		this.ciudad=null;
		this.dni=null;
		}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Los datos de la persona son [edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", nombre=" + nombre + ", ciudad="
				+ ciudad + ", dni=" + dni + "]";
	}
	
	
}
