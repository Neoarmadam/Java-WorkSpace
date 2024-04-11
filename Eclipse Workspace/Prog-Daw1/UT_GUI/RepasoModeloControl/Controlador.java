package RepasoModeloControl;

import RepasoModeloControl.Ventana;
import Utilidades.UtDialogos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener, MouseListener{
	Ventana ventana;
	Modelo model;
	
	
	public Controlador(Ventana ventana, Modelo model) {
		super();
		this.ventana = ventana;
		this.model = model;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int a=UtDialogos.dialoPedirEntero(ventana, "Dame un numero");
		int b=UtDialogos.dialoPedirEntero(ventana, "Dame un numero");
		int result=model.sumar(a, b);
		ventana.getLblResultado().setText("El resultado es: " +result);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		ventana.getTextPane().setBackground(Color.magenta);
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ventana.getTextPane().setBackground(Color.blue);
	}

}
