package Abraham;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Datainput {

	public static void main(String[] args) {

		String dni;
		int edad;
		String nombre;
		//Abrimos el fichero para escritura
				
				try {
					DataInputStream entrada= new DataInputStream(new FileInputStream("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\data.abra"));
					dni= entrada.readUTF();
					entrada.readChar(); //Estan para no leer los "/t"
					edad=entrada.readInt();
					entrada.readChar();
					nombre=entrada.readUTF();
					entrada.readChar();
					entrada.close();
					System.out.println("dni: "+dni+"\tedad: "+edad+"\tnombre: "+nombre);
				}catch(IOException e) {
					e.printStackTrace();
				}

	}

}
