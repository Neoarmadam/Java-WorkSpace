package Pruebas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
	Ventana vista;
	static int cont=0;
	public Controlador(Ventana vista) {
		super();
		this.vista=vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (cont%2==0) {
			vista.getPanelColor().setBackground(Color.red);
		}else {
			vista.getPanelColor().setBackground(Color.blue);
		}
		cont++;
	}

}
