package PruebasJaxbAbraham;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



public class escribirCliente {

	public static void main(String[] args) throws IOException {
		String ruta="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\XML\\Cliente.xml";
		Cliente cli = new Cliente(1, "David", "Palencia");
		escribirCliente(ruta, cli);

	}

	/**
	 * Metodo que escribe un cliente en un fichero xml
	 * @param ruta
	 * @throws IOException
	 */
	private static void escribirCliente(String ruta, Cliente cli) throws IOException {
		FileWriter fich=new FileWriter(ruta);
		
		System.out.println(cli.toString());
		try {
			JAXBContext contex = JAXBContext.newInstance(Cliente.class);
			Marshaller marshaller = contex.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT , true);
			marshaller.marshal(cli, fich);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
