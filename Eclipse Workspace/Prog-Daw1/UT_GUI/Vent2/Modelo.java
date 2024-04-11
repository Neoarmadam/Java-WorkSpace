package Vent2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Modelo {
	
	String leerTexto(String ruta) {
		//"D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Entornos de Desarrollo\\NetBeans\\Ficheros\\lista.txt"
		String lista="";
		try{
      File fichero=new File(ruta);
      FileReader fr = new FileReader(fichero);
      BufferedReader reader= new BufferedReader(new InputStreamReader(new FileInputStream(ruta), "utf-8"));;
      String line;
      while((line=reader.readLine()) != null){
          lista+=line+"\n";
      }
      reader.close();
		}catch(Exception e){
      e.printStackTrace();
		}
		return lista;
	}
	
}
