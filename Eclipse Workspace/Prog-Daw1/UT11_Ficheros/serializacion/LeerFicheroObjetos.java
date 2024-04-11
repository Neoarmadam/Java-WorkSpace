package serializacion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeerFicheroObjetos {
  
	public static void main(String[] args) {
		Alumno1 alu;
		boolean seguir=true;
		ObjectInputStream fichObjetos = null;
		try {
			fichObjetos= new ObjectInputStream(new FileInputStream("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\fichObjets.obj"));
			while(seguir) {
				try {
				alu=(Alumno1) fichObjetos.readObject();
				System.out.println(alu.toString());
				}catch(EOFException e) {
					seguir=false;
				}
			}
			fichObjetos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
