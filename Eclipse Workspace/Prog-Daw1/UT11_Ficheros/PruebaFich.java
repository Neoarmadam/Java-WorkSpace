	import java.io.File;
	import java.util.Scanner;
public class PruebaFich {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String directorio="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\1";
		File dir=new File(directorio);
		File fich= new File(directorio, "docu1.txt");
		
		/************Lista Ficheros En Un Directorio***********
		String[] contenido;
		
		contenido=dir.list();
		for (int f=0; f<contenido.length; f++) {
			System.out.println(contenido[f]);
		}*/
		System.out.println("Dame la ruta");
		directorio=sc.nextLine();
		if(fich.exists()) {
			System.out.println("El archivo o directorio existe");
			if (fich.isFile()) {
				System.out.println(fich.getAbsolutePath() + " es un archivo");
			}else {
				System.out.println(fich.getAbsolutePath() + " es un directorio");
			}
		}else {
			System.out.println("No existe");
		}
		
		
		
		
		
		
		
		//File fich1=new File(dir,"docu11.txt");
		/*
		if(fich.exists()) {
			fich.renameTo(fich1);
			System.out.println(fich.getAbsolutePath());
			System.out.println(fich.lastModified());
			
		}
		*/

		/*
		if(!fich.isDirectory()){
			System.out.println(fich.getAbsolutePath());
			fich.mkdir();
		}
		*/
	}
}
