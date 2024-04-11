package Libreria;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import PruebasJaxbAbraham.Cliente;
import PruebasJaxbAbraham.ListaClientes;

public class EscribirListaLibros {
	public static void main(String[] args) throws IOException {
		ArrayList<Libro> list=new ArrayList<Libro>();
		ListaLibros lista;//=new ListaClientes(list);
		String ruta="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\XML\\Listalibros.xml";
		list.add(new Libro("klasdh", "Mondongo" ," Neo"));
		list.add(new Libro("iu28ou3","Como Peinarse", "David"));
		list.add(new Libro("kjhasjkh","No se contar","Carlos"));
		
		lista=new ListaLibros(list);
		
		
		escribirLibros(ruta, lista );
		

	}

	/**
	 * Metodo que escribe una clase ListaClientes en un fichero xml
	 * @param ruta
	 * @throws IOException
	 */
	private static void escribirLibros(String ruta, ListaLibros lista ) throws IOException {
		FileWriter fich=new FileWriter(ruta);
		
		//System.out.println(lista.toString());
		try {
			JAXBContext contex = JAXBContext.newInstance(ListaLibros.class);
			Marshaller marshaller = contex.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT , true);
			marshaller.marshal(lista, fich);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
