	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;
	import java.io.BufferedReader;

public class LeerTexto {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String directorio="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\1";
		File dir=new File(directorio);
		File fich= new File(directorio, "docu1.txt");
		
		
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
}
