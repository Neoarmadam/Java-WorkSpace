package Abraham;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {

	public static void main(String[] args) {
		String dni="21325343R";
		int edad=32;
		String nombre="Chindasvinto Rey Godo";
		
		//Abrimos el fichero para lectura
		
		try {
			DataOutputStream salida= new DataOutputStream(new FileOutputStream("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\data.abra"));
			salida.writeUTF(dni);
			salida.writeChar('\t');
			salida.writeInt(edad);
			salida.writeChar('\t');
			salida.writeUTF(nombre);
			salida.writeChar('\t');
			salida.writeFloat(9.3f);
			salida.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	
	}

}
