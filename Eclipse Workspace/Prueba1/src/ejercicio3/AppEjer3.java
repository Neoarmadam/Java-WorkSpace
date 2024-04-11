package ejercicio3;

public class AppEjer3 {
	public static void main(String[] args) {
		Ventana3 ventana=new Ventana3();
		Modelo3 modelo=new Modelo3();
		Controlador3 control=new Controlador3(ventana, modelo);
		ventana.enlazarControlador(control);
		ventana.setVisible(true);
		
	}
}
