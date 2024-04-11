package Actividad_27;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerEmp {
	/**
	 * Lee los Empleados de la clase Empleado guardados de un archivo pasado por parametro
	 * @param archivo
	 */
	static void LeerEmpleados(String archivo) {
		Empleado auxEmp;
		boolean seguir=true;
		ObjectInputStream fichObj=null;
		try {
			fichObj=new ObjectInputStream(new FileInputStream(archivo));
			while(seguir) {
				try {
					auxEmp=(Empleado) fichObj.readObject();
					System.out.println(auxEmp.toString());
				}catch(EOFException e) {
					seguir=false;
				}
			}
			fichObj.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Lee los Empleados de la clase Empleado guardados de un archivo pasado por parametro
	 * @param archivo
	 * @param TAM
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	static void LeerEmpleados(String archivo, int TAM) throws FileNotFoundException, IOException, ClassNotFoundException{
		Empleado[] auxEmp= new Empleado[TAM];
		boolean seguir=true;
		ObjectInputStream fichObj=null;
		int f=0;
	//	try {
			fichObj=new ObjectInputStream(new FileInputStream(archivo));
			while(seguir) {
				try {
					auxEmp[f]=(Empleado) fichObj.readObject();
					System.out.println(auxEmp[f].toString());
				}catch(EOFException e) {
					seguir=false;
				}
			}
			fichObj.close();
		/*} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
	}
	
	static void LeerEmpleados(String archivo, Empleado[] oficina) {
		Empleado[] auxEmp;
		boolean seguir=true;
		ObjectInputStream fichObj=null;
		try {
			fichObj=new ObjectInputStream(new FileInputStream(archivo));
			auxEmp=(Empleado[]) fichObj.readObject();
			fichObj.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}