import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad_22 {
	public static void main(String[] args) {
		//Vectores ya inicializados
		String [] nombres= {"David","Neo","Carlos"};
		int [] edades= {35,21,19};
		float [] notas= {9.8f, 7.8f, 2};
		//Cosas para usar el fichero
		String ruta ="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\";
		String documento="Ejer22.txt";
		File fich= new File(ruta, documento);
		
		
		escribirFichero(nombres, edades, notas, fich);
		leerFichero(fich);
	}
	private static void leerFicheroStream(File fich) {
		try {
			FileInputStream fichero=new FileInputStream(fich);
			DataInputStream entrada=new DataInputStream(fichero);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Leer los datos del fichero
	private static void leerFichero(File fich) {
		try {
			FileReader lectorFich= new FileReader(fich);
			BufferedReader lectorBuffer=new BufferedReader(lectorFich);
			String linea=lectorBuffer.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea=lectorBuffer.readLine();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Escribir en el fichero los datos
	private static void escribirFichero(String[] nombres, int[] edades, float[] notas, File fich) {
		try {
			FileWriter escriFich= new FileWriter(fich);
			BufferedWriter escriBuffer=new BufferedWriter(escriFich);
			for (int f=0; f<nombres.length; f++) {
				escriBuffer.write(nombres[f]+" "+edades[f]+" "+notas[f]+"\n");
			}
			escriBuffer.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
