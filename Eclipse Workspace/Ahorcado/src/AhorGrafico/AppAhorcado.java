package AhorGrafico;

/**
 * AppAhorcado.java
 * La clase AppAhoracdo es la clase que hace de aplicacion para el proyecto Ahorcado.
 * 
 * @author Neo Armada
 * @version 1.0 30/5/2023
 */
public class AppAhorcado {
	public static void main(String[] args) {
		String ruta="src//AhorGrafico//palabras5.txt";
		
		AhorVent ventana= new AhorVent();
		Modelo modelo= new Modelo();
		Controlador control= new Controlador(ventana, modelo);
		ventana.enlazarControlador(control);
		ventana.setVisible(true);
		modelo.setPalabraOculta(modelo.elegirPalabra(ruta));
		
	}
}
