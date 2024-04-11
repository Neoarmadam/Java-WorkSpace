package FicherosAleatorios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

public class ArchivosAleatorios {

	public static void main(String[] args) {
		
		Alumno clase[] =new Alumno[5];
		clase[0]= new Alumno(1,11,1.11f,'a',"DAW");
		clase[1]= new Alumno(2,22,1.22f,'b',"DAW");
		clase[2]= new Alumno(3,33,1.33f,'a',"DAW");
		clase[3]= new Alumno(4,44,1.4f,'a',"DAW");
		clase[4]= new Alumno(5,55,1.5f,'d',"DAW");
		
		try {
			RandomAccessFile raf=new RandomAccessFile("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\random.dat", "rw");
			for (int i=0;i<clase.length;i++) {
				raf.writeInt(clase[i].getId());
				raf.writeInt(clase[i].getEdad());
				raf.writeFloat(clase[i].getAltura());
				raf.writeChar(clase[i].getGrupo());
				raf.writeChars(clase[i].getCiclo()+"\n");
				//raf.writeUTF();
			}
			raf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	public static void escribirFichero() {
		
	}
}
