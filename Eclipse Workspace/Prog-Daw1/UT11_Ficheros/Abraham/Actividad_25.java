package Abraham;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Actividad_25 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		try {

			RandomAccessFile fichero= new RandomAccessFile("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\fichero.dat", "rw"); 
			System.out.println("Inserte un nombre (\"ninguno\" para salir): "); 
			String nomNuevo=entrada.nextLine();

			while(!nomNuevo.equalsIgnoreCase("ninguno")) {
				fichero.seek(fichero.length());//colocamos el puntero al final del fichero. fichero.writeBytes (nomNuevo); //escribimos al final del fichero fichero.write('\n');//para separarlo del siguiente nombre que se inserte. System.out.println("Inserte un nombre (\"ninguno\" para salir): "); nomNuevo entrada.nextLine():
				fichero.writeBytes(nomNuevo); //colocamos el puntero al principio del fichero
				fichero.write('\n');
				System.out.println("Inserte un nombre (\ninguno para salir): ");
				nomNuevo= entrada.nextLine();
				
			}
			fichero.seek(0);
			String nombre=fichero.readLine();
			
			while (nombre != null) {
				System.out.println("El nombre leido nombre");
					nombre= fichero.readLine();
			}
			fichero.close();

			} catch (FileNotFoundException e) {

			System.out.println(e);

			} catch (IOException e) {

			System.out.println(e);
			}
		}
	}

