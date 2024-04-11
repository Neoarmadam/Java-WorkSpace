package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EscribirArchivo {
	public static void main(String[] args) throws IOException {
		FileWriter archivo= new FileWriter("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\Repaso\\Prueba.txt");
		BufferedWriter escritor = new BufferedWriter(archivo);
		escritor.write("España" +"\n");
		escritor.write("Tè");
		escritor.close();
		
		
		
		FileReader archivoL= new FileReader("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\Repaso\\Prueba.txt");
		BufferedReader lector= new BufferedReader(archivoL);
		String linea=lector.readLine();
		while(linea!=null) {
			System.out.println(linea);
			linea=lector.readLine();
		}
		lector.close();
	}
}
