package FicherosAleatorios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ArchivosAleatoriosLeer {

	public static void main(String[] args) {
		int id;
		int edad;
		float altura;
		char grupo;
		String ciclo="";
		int cicloLength;
		int salto;
		
		
		try {
			RandomAccessFile raf=new RandomAccessFile("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\random.dat", "r");
			raf.skipBytes(200);
			
			if (raf.getFilePointer()<raf.length()) {
				id=raf.readInt();
				edad=raf.readInt();
				altura=raf.readFloat();
				grupo=raf.readChar();
			
				/*
				 * PARA LEER LA CADENA DEL CODIGO TENGO DOS POSIBILIDADES leer caracter a caracter o leer la línea
				 * leyendo la linea tengo que utilizar una estrategia al escribir para saber el tamaño exacto de la cadena
				 * y poder utilizar esto en los saltos 
				 */
				/*
				ciclo+=raf.readChar();
				ciclo+=raf.readChar();
				ciclo+=raf.readChar();
				ciclo+=raf.readChar();
				*/
				ciclo=raf.readLine();
				cicloLength=ciclo.length();
				//System.out.println(ciclo.length());
				System.out.println("Alumno--\n\tid= "+id+"\n\tedad="+edad+"\n\taltura="+altura+"\n\tgrupo="+grupo+"\n\tciclo="+ciclo);
				
				/* 
				 * int =4 bytes
				 * float=4 bytes
				 * char=2 bytes
				 * 
				 * Cada registro ocupa --> 2*int+float+char+String --> 2*4+4+2+(2*longitudString)
				 */
			//	salto=14+(2*cicloLength);
				
				/* ************** Probemos el salto ********************** */
				salto=22;
				//raf.skipBytes(salto*2);
				raf.seek(salto);
				System.out.println(raf.getFilePointer());
				
				id=raf.readInt();
				edad=raf.readInt();
				altura=raf.readFloat();
				grupo=raf.readChar();
				ciclo="";
				ciclo+=raf.readChar();
				ciclo+=raf.readChar();
				ciclo+=raf.readChar();
				ciclo+=raf.readChar();
				//ciclo=raf.readUTF();
				cicloLength=ciclo.length();
			
				System.out.println("Alumno--\n\tid= "+id+"\n\tedad="+edad+"\n\taltura="+altura+"\n\tgrupo="+grupo+"\n\tciclo="+ciclo);
			}else {
				System.out.println("Estas fuera del fichero");
			}
			
			/*
			raf.readUnsignedShort();
			raf.writeInt(clase[i].getId());
			raf.writeInt(clase[i].getEdad());
			raf.writeFloat(clase[i].getAltura());
			raf.writeChar(clase[i].getGrupo());
			raf.writeChars(clase[i].getCiclo());
			*/
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
