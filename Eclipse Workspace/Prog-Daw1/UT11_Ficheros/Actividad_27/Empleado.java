package Actividad_27;
	import java.io.Serializable;
	import Utilidades.UtDialogos;

public class Empleado implements Serializable{
	//Variables de la clase Empleado
	String nombre;
	float sueldo;
	int edad;
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", edad=" + edad + "]";
	}

	//******Constructores*****//
	public Empleado(String nombre, float sueldo, int edad) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		setEdad(edad);
	}
	
	public Empleado() {
		nombre=UtDialogos.dialoPedirString("Dame el nombre");
		setSueldo(sueldo);
		setEdad(edad);
	}
	
	//******Get/Set*******//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		while (sueldo<0) {
			sueldo=(float) UtDialogos.dialoPedirDouble("Dime un sueldo positivo");
		}
		this.sueldo = sueldo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		while (edad<0) {
			edad=UtDialogos.dialoPedirEntero("Dime una edad positiva");
		}
		this.edad = edad;
	}
	
}//Fin Clase
