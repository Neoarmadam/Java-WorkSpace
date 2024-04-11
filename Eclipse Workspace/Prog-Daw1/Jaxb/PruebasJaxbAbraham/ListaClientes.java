package PruebasJaxbAbraham;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Lista_Clientes")
public class ListaClientes {
	ArrayList<Cliente> lista=new ArrayList<Cliente>();

	public ListaClientes(ArrayList<Cliente> lista) {
		super();
		this.lista=lista;
	}
	public ListaClientes() {
		super();
	}
	
	public void mostrarLista() {
		for (Cliente cliente : lista) {
			System.out.println(cliente.toString());
		}
	}
	
	@XmlElementWrapper(name="clientes")
	@XmlElement(name="cliente")
	public ArrayList<Cliente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cliente> lista) {
		this.lista = lista;
	}
		
}
