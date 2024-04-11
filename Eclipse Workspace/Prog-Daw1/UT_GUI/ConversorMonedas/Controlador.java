package ConversorMonedas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Utilidades.UtDialogos;

public class Controlador implements ActionListener {
	VenConv ventana;
	Modelo model;
	
	
	public Controlador(VenConv ventana, Modelo model) {
		super();
		this.ventana = ventana;
		this.model = model;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String strEntrada=ventana.getTextField().getText();
		//System.out.println(ventana.getChInvertir().hasFocus());
		float moneda=0;
		String moned="";
		
		//If para detectar si le damos al boton libras
		if(e.getActionCommand()=="Libras") {
			moneda = leerFloat(strEntrada, moneda);
			if (e.getActionCommand()=="Invertir Conversor") {
				moneda=model.converDolarLibras(moneda);
				
			}else {
				moneda=model.converEuroLibras(moneda);
			}
			moned="Libras: ";
		}else {
			System.out.println(e.getActionCommand());
			if (e.getActionCommand()=="Invertir Conversor") {
				UtDialogos.dialoMensaje("Va al reves");
			}else {
				moneda = leerFloat(strEntrada, moneda);
				if(ventana.getChInvertir().isSelected()==false) {
					moneda=model.converEuroDolar(moneda);
					moned="Dolares: ";
				}else {
					moneda=model.converDolarEuro(moneda);
					moned="Euro: ";
				}
			}
		}
		ventana.getLblResultado().setText(moned+moneda);
	}


	private float leerFloat(String strEntrada, float moneda) {
		try {
			moneda=Float.parseFloat(strEntrada);
		}catch(NumberFormatException e1){
			UtDialogos.dialoError(ventana, "Eso no es un numero");
		}
		return moneda;
	}
	
	
	
	
	public void actionPerformedOld(ActionEvent e) {
		String strEntrada=ventana.getTextField().getText();
		//System.out.println(ventana.getChInvertir().hasFocus());
		float moneda=0;
		
		
		System.out.println(e.getActionCommand());
		if (e.getActionCommand()=="Invertir Conversor") {
			UtDialogos.dialoMensaje("Va al reves");
		}else {
			moneda = leerFloat(strEntrada, moneda);
			if(ventana.getChInvertir().isSelected()==false) {
				moneda=model.converEuroDolar(moneda);
			}else {
				moneda=model.converDolarEuro(moneda);
			}
			ventana.getLblResultado().setText("Dolares: "+moneda);
		}
		
	}
}
