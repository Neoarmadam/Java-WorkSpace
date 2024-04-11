package Ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Objetos.Movil;

public class EscribirMovil {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String ruta="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\Repaso\\Prueba.txt";
		Movil neo=new Movil("Realme gt Neo 3T","Realme",8,"Snapdragon 870");
		Movil sutriz=new Movil("Iphone 12","Apple",6,"M1");
		
		ObjectOutputStream salida= new ObjectOutputStream(new FileOutputStream(ruta));
		salida.writeObject(neo);
		salida.writeObject(sutriz);
		salida.close();
		
		ObjectInputStream entrada= new ObjectInputStream(new FileInputStream(ruta));
		System.out.println(entrada.readObject().toString());
		System.out.println(entrada.readObject());
		entrada.close();
	}
}
