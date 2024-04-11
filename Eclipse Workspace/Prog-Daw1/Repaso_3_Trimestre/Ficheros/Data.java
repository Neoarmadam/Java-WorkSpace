package Ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data {
	public static void main(String[] args) throws IOException {
		String[]cosas={"Neo","Sutriz"};
		String ruta="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\Repaso\\Prueba.txt";
		DataOutputStream salida= new DataOutputStream(new FileOutputStream(ruta));
		salida.writeUTF(cosas[0]);
		salida.writeUTF(cosas[1]);
		salida.close();
		
		DataInputStream entrada= new DataInputStream(new FileInputStream(ruta));
		System.out.println(entrada.readUTF());
		System.out.println(entrada.readUTF());
		entrada.close();
	}
}
