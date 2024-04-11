package RepasoModeloControl;


public class SumarApp {
	public static void main(String[] args) {
		Ventana ventana=new Ventana();
		Modelo modelo=new Modelo();
		Controlador control=new Controlador(ventana, modelo);
		ventana.enlazarControlador(control);
		ventana.setVisible(true);
	}
}
