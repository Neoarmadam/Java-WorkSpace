package serializacion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class EscribirFicheroObjetos {
  final static int TAM=4;
	public static void main(String[] args) {
		Alumno1 clase[]=new Alumno1[TAM];
		clase[0]= new Alumno1(1,11,1.11f,'a',"DAW");
		clase[1]= new Alumno1(2,22,1.22f,'b',"DAW");
		clase[2]= new Alumno1(3,33,1.33f,'a',"DAW");
		clase[3]= new Alumno1(4,44,1.4f,'a',"DAW");
		
		File fich= new File("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros", "fichObjets.obj");
		if(fich.exists()) {
			try {
				ObjectOutputStream fichObjetos= new MiObjectOutputStream(new FileOutputStream("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\fichObjets.obj"));
				for (int i = 0; i < clase.length; i++) {
					fichObjetos.writeObject(clase[i]);
				}
				fichObjetos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}else {
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

}
