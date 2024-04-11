package ConversorMonedas;

import ConversorMonedas.Controlador;
import ConversorMonedas.Modelo;

public class AppConversor {
	public static void main(String[] args) {
		VenConv ventana=new VenConv();
		Modelo modelo=new Modelo();
		Controlador control=new Controlador(ventana, modelo);
		ventana.enlazarControlador(control);
		ventana.setVisible(true);
	}
	
	
}
