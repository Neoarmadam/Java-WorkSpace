package Actividad_27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirEmp {
	/**
	 * Escribe los Empleados guardados en un vector de tipo Empleado en una ruta pasada por parametro (Sobrescribe el archivo de la ruta si hay alguno)
	 * @param archivo
	 * @param TAM
	 * @param oficina
	 */
	static void EscribirEmpleados(String archivo, final int TAM, Empleado[] oficina) {
		//File fich=new File(archivo);
		try {
			ObjectOutputStream fichObj= new ObjectOutputStream(new FileOutputStream(archivo));
			for (int f=0; f<TAM; f++) {
				fichObj.writeObject(oficina[f]);
			}
			fichObj.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void EscribirEmpleados(String archivo, Empleado[] oficina) {
		//File fich=new File(archivo);
		try {
			ObjectOutputStream fichObj= new ObjectOutputStream(new FileOutputStream(archivo));
			fichObj.writeObject(oficina);
			fichObj.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
