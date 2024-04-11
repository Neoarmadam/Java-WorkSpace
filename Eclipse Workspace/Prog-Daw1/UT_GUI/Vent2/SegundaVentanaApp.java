package Vent2;

import java.util.ArrayList;

public class SegundaVentanaApp {
	public static void main(String[] args) {
		ArrayList lista=new ArrayList();
		
		Puerta puerta= new Puerta();
		Modelo mod= new Modelo();
		Mando ps4=new Mando(puerta,mod);
		
		
		ps4.cargarTexto();
		puerta.setVisible(true);
	}
}
