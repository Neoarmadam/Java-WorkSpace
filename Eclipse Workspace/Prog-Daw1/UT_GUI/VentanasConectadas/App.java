package VentanasConectadas;

public class App {
	
	public static void main(String[] args) {
		Puerta puerta= new Puerta();
		Trastero trastero=new Trastero();
		MandoTrastero control=new MandoTrastero(trastero, puerta);
		
		puerta.setVisible(true);
		puerta.enlazarControl(control);
		trastero.enlazarControl(control);
	}
}
