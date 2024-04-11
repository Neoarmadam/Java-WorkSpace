package Vent2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Mando { //implements ActionListener { Para botones
	Puerta puerta;
	Modelo mod;
	
	
	public Mando(Puerta puerta) {
		super();
		this.puerta=puerta;
	}
	
	public Mando(Puerta puerta, Modelo mod) {
		super();
		this.puerta=puerta;
		this.mod=mod;
	}
	
	
	
	public void cargarTexto() {
		String texto=mod.leerTexto("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Entornos de Desarrollo\\NetBeans\\Ficheros\\lista.txt");
		puerta.getTextArea().setText(texto);
	}
	
	
	public void cargarTexto(String texto) {
		puerta.getTextArea().setText(texto);
	}
	
	public void cargarTexto(ArrayList lista) {
		String texto="";
		for(int f=0; f<lista.size();f++) {
			texto=texto+lista.get(f)+", ";
			//System.out.println(lista.get(f));
		}
		puerta.getTextArea().setText(texto);
	}
	

}
