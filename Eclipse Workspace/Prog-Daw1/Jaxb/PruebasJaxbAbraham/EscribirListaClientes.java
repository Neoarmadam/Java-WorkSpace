package PruebasJaxbAbraham;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EscribirListaClientes {
	public static void main(String[] args) throws IOException {
		ArrayList<Cliente> list=new ArrayList<Cliente>();
		ListaClientes lista;//=new ListaClientes(list);
		String ruta="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\XML\\ListaCliente.xml";
		list.add(new Cliente(1, "David","Palencia"));
		list.add(new Cliente(2, "Neo","Palencia"));
		list.add(new Cliente(3, "Carlos","Baltanas"));
		list.add(new Cliente(4, "Bea","Venta de Baños"));
		lista=new ListaClientes(list);
		
		
		escribirCliente(ruta, lista );
		

	}

	/**
	 * Metodo que escribe una clase ListaClientes en un fichero xml
	 * @param ruta
	 * @throws IOException
	 */
	private static void escribirCliente(String ruta, ListaClientes lista ) throws IOException {
		FileWriter fich=new FileWriter(ruta);
		
		//System.out.println(lista.toString());
		try {
			JAXBContext contex = JAXBContext.newInstance(ListaClientes.class);
			Marshaller marshaller = contex.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT , true);
			marshaller.marshal(lista, fich);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
