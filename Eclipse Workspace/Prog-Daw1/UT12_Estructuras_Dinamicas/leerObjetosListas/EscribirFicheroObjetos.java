package leerObjetosListas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Ejemplos.Alumno1;



public class EscribirFicheroObjetos {
  final static int TAM=4;
	public static void main(String[] args) {
		Alumno1 clase[]=new Alumno1[TAM];
		clase[0]= new Alumno1(1, 19, 176, 'a', "Daw");
		clase[1]= new Alumno1(2, 21, 176, 'n', "Daw");
		clase[2]= new Alumno1(3, 35, 176, 'z', "Daw");
		clase[3]= new Alumno1(4,21,1.4f,'a',"DAW");
		
		File fich= new File("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros", "fichObjets.obj");
		
		try {
			ObjectOutputStream fichObjetos= new ObjectOutputStream(new FileOutputStream("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\fichObjets.obj"));
			for (int i = 0; i < clase.length; i++) {
				fichObjetos.writeObject(clase[i]);
			}
			fichObjetos.close();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		

	}

}
