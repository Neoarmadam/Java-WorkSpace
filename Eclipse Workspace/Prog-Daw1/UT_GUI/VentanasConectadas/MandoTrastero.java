package VentanasConectadas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Utilidades.UtDialogos;

public class MandoTrastero implements ActionListener {
	Trastero trastero;
	Puerta puerta;
	
	public MandoTrastero(Trastero trastero, Puerta puerta) {
		super();
		this.trastero = trastero;
		this.puerta=puerta;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Matusaren") {
			trastero.setVisible(true);
		}else if(e.getActionCommand()=="Marsupial") {
			puerta.getLblSalida().setText(trastero.getEntrada().getText());
			trastero.setVisible(false);
		}else if(e.getActionCommand()=="Open");{
			UtDialogos.dialoMensaje(puerta, "Lo que te van ha abrir es a ti el culo");
			//JFileChooser
		}
		
		

	}

}
