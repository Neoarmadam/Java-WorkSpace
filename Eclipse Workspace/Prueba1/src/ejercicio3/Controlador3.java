package ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AhorGrafico.AhorVent;
import AhorGrafico.Modelo;
import dialogos.Dialogos;
	


public class Controlador3 implements ActionListener{
	Ventana3 ventana= new Ventana3();
	Modelo3 modelo= new Modelo3();
	
	public Controlador3(Ventana3 ventana, Modelo3 modelo) {
		this.ventana = ventana;
		this.modelo = modelo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int numDNI=-4;
		String entradaNum=ventana.getTfNumDNI().getText();
		String entradaLer=ventana.getTfLetraDNI().getText();
		if(e.getActionCommand()=="Comprobar") {
			if(entradaNum.length()!=9) {
				Dialogos.mostrarError(ventana, "Numero de caracteres erroneos", "Error");
			}else if(entradaLer.length()!=1) {
				Dialogos.mostrarError(ventana, "Debes introducir una letra no otra cosa", "Error");
			}else {
				try {
					numDNI=Integer.parseInt(entradaNum);
					if(modelo.comprobarDNI(numDNI,entradaLer.charAt(0))==-1) {
						ventana.getLblLetra().setText("Correcto");
						//ventana.getContentPane().setBackground(green);
					}else {
						ventana.getLblLetra().setText("Incorrecto");
						//ventana.getContentPane().setBackground(255,238,238);
						
					}
				}catch(Exception ae) {
					Dialogos.mostrarError(ventana, "Eso no es un numero", "Error");
				}
			}
		}else if(e.getActionCommand()=="Obtener") {
			if(entradaNum.length()!=9) {
				Dialogos.mostrarError(ventana, "Numero de caracteres erroneos", "Error");
			}else {
				try {
					numDNI=Integer.parseInt(entradaNum);
					
					ventana.getTfLetraDNI().setText(""+modelo.obtenerDNI(numDNI));
				}catch(Exception ae) {
					Dialogos.mostrarError(ventana, "Eso no es un numero", "Error");
				}
			}
		}
		
		
		
	}
	
}
