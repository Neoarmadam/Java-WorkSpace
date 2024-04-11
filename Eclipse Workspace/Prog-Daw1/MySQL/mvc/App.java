package mvc;

class App {
	public static void main(String[] args) {
		Ventana frame=new Ventana();
		Modelo mod=new Modelo();
		Controlador control=new Controlador(frame, mod);
		
		frame.enlazarControlador(control);
		frame.setVisible(true);
	}
}
