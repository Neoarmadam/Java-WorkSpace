import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirTexto {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String directorio="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\1";
		File dir=new File(directorio);
		File fich= new File(directorio, "docu1.txt");
		
		
		
		try {
			FileWriter escriFich= new FileWriter(fich);
			BufferedWriter escriBuffer=new BufferedWriter(escriFich);
			
			escriBuffer.write("Alfonso");
			escriBuffer.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
