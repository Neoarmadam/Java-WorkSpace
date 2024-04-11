package PruebasJaxbAbraham;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType (propOrder= {"id","nombre","ciudad"})
public class Cliente {
	int id;
	String nombre;
	String ciudad;
	

	public Cliente() {
		super();
	}

	public Cliente(int id, String nombre, String ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	//@XmlElement (name="identificador") //Cambia el nombre de la variable al exportar
	//@XmlTransient //Ignora cosas
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
}
