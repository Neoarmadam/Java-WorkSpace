     package Libreria;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Libreria")
public class ListaLibros {
	ArrayList<Libro> lista=new ArrayList<Libro>();
	
	public ListaLibros(ArrayList<Libro> lista) {
		super();
		this.lista=lista;
	}
	
	public ListaLibros() {
		super();
	}
	
	public void mostrarLista() {
		for (Libro libro : lista) {
			System.out.println(libro.toString());
		}
	}
	
	@XmlElement(name="libro")
	public ArrayList<Libro> getLista(){
		return lista;
	}
	
	public void setLista(ArrayList<Libro> lista) {
		this.lista=lista;
	}
}
