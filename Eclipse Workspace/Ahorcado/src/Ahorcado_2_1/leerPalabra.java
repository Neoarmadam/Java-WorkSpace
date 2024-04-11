package Ahorcado_2_1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class leerPalabra {
	public static void main(String[] args) {
		ArrayList<String> palabras=new ArrayList<String>();
		String ruta="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\palabras5.txt";
		
		//leerPalabras(palabras, ruta);
		//imprimirLista(palabras);
	}
	
	
	static void leerPalabras(ArrayList<String> palabras, String ruta) {
		try {
			//BufferedReader lectorBuffer=new BufferedReader(lectorFich);
			BufferedReader lectorBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(ruta), "utf-8"));
			String linea=lectorBuffer.readLine();
			while(linea!=null) {
				palabras.add(linea);
				linea=lectorBuffer.readLine();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Imprime un array list dado por parametro
	 * @param lista
	 */
	private static void imprimirLista(ArrayList lista) {
		//Escribir ArrayList
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			System.out.println(lista.get(f));
		}
		System.out.println("--------------------");
	}
}
