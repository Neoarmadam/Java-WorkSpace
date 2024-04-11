package Actividad_27;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Actividad_27 {
	public static void main(String[] args) {
		//Variables del Main
		final int TAM=3;
		String archivo="D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\Actividad27.obj";
		Empleado [] oficina= new Empleado[TAM];
		oficina[0]= new Empleado("Neo", 2100, 21);
		oficina[1]= new Empleado("David", 2200, 35);
		oficina[2]= new Empleado("Alvaro", 1900, 21);
		
		EscribirEmp.EscribirEmpleados(archivo, oficina);
		
		
		LeerEmp.LeerEmpleados(archivo, oficina);
		
		
	}
	
}
