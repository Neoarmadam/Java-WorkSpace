package UT8_Objetos;

public class Persona {
	int edad;
	float altura;
	float peso;
	String nombre;
	//private int setEdad;
	
	
	public static void main (String args[]) {
		Persona abraham=new Persona();
		Persona perso2=new Persona();
		Persona perso3=new Persona();
		
		abraham.edad=43;
		abraham.altura=178;
		abraham.peso=92;
		perso2.setEdad(24);
		perso2.setAltura(165);
		
		System.out.println(abraham.edad);
		System.out.println(perso2.getEdad());
		
		System.out.println(perso3.toString());
	}
	
	
	
	public int getEdad() {
		return edad;
	}
	public float getPeso() {
		return peso;
	}
	public float getAltura() {
		return altura;
	}
	
	public void setEdad(int nuevaEdad) {
		if(nuevaEdad>0) {
			edad=nuevaEdad;
		}
	}
	
	public void setAltura(int nuevaAltura) {
		altura=nuevaAltura;
	}
	
	public void setPeso(float peso) {
		this.peso=peso;
	}
	public void setNombre(String nuevaNombre) {
		nombre=nuevaNombre;
	}


	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", nombre=" + nombre + "]";
	}



	
	
	
}
