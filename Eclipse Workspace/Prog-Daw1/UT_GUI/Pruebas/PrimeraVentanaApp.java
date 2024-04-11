package Pruebas;

public class PrimeraVentanaApp {
	public static void main(String[] args) {
		Ventana ventana=new Ventana();
		Controlador control =new Controlador(ventana);
		ventana.enlazaControlador(control);
	}
}
