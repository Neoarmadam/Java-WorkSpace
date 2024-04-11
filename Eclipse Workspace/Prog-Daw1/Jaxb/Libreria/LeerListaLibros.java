package Libreria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

import PruebasJaxbAbraham.ListaClientes;


public class LeerListaLibros {
	public static void main(String[] args) throws IOException {
		String ruta="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\XML\\Listalibros.xml";
		ListaLibros lista=null;
		//Cliente cli=new Cliente();
		//System.out.println("<<"+cli.toString());
		leerCliente(ruta, lista);
		
		
	}

	private static void leerCliente(String ruta,ListaLibros lista) throws FileNotFoundException {
		try {
			JAXBContext contex = JAXBContext.newInstance(ListaLibros.class);
			Unmarshaller unmarshaller = contex.createUnmarshaller();
			//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT , true);
			lista=(ListaLibros) unmarshaller.unmarshal(new FileReader(ruta));
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		lista.mostrarLista();
	}
}
