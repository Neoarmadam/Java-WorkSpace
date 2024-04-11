package PruebasJaxbAbraham;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class leerCliente {
	public static void main(String[] args) throws IOException {
		String ruta="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\XML\\Cliente.xml";
		
		//Cliente cli=new Cliente();
		//System.out.println("<<"+cli.toString());
		leerCliente(ruta);
		
		
	}

	private static void leerCliente(String ruta) throws FileNotFoundException {
		Cliente cli;
		try {
			JAXBContext contex = JAXBContext.newInstance(Cliente.class);
			Unmarshaller unmarshaller = contex.createUnmarshaller();
			//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT , true);
			cli=(Cliente) unmarshaller.unmarshal(new FileReader(ruta));
			System.out.println(cli.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	
}
