package leerObjetosListas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Ejemplos.Alumno1;

public class leerAlumno1 {
	public static void main(String[] args) {
		ArrayList<Alumno1> alumnos=new ArrayList<Alumno1>();
		String ruta= "D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\fichObjets.obj";
		leerListaAlumno1(ruta, alumnos);
		
		imprimirLista(alumnos);
	}
	
	
	public static void leerListaAlumno1(String ruta, ArrayList<Alumno1> alumnos) {
		boolean seguir=true;
		Alumno1 alu;
		
		ObjectInputStream fichObjetos = null;
		try {
			fichObjetos= new ObjectInputStream(new FileInputStream(ruta));
			while(seguir) {
				try {
					alu=(Alumno1) fichObjetos.readObject();
					alumnos.add(alu);
				}catch(EOFException e) {
					seguir=false;
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void leerListaAlumno1(File ruta, ArrayList<Alumno1> alumnos) {
		boolean seguir=true;
		Alumno1 alu;
		
		ObjectInputStream fichObjetos = null;
		try {
			fichObjetos= new ObjectInputStream(new FileInputStream(ruta));
			while(seguir) {
				try {
					alu=(Alumno1) fichObjetos.readObject();
					alumnos.add(alu);
				}catch(EOFException e) {
					seguir=false;
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		
	/**
	 	* Imprime un array list dado por parametro
	 	* @param lista
	 	*/
	private static void imprimirLista(ArrayList<Alumno1> lista) {
		//Escribir ArrayList
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			System.out.println(lista.get(f));
		}
		System.out.println("--------------------");
	}
	
}
