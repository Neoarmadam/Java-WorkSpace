package AhorGrafico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Controlador.java
 * Controlador del proyecto Ahorcado.
 * 
 * @author Neo Armada
 * @version 1.0 30/05/2023
 */
public class Controlador implements ActionListener{
	AhorVent ventana= new AhorVent();
	Modelo modelo= new Modelo();
	
	public Controlador(AhorVent ventana, Modelo modelo) {
		super();
		this.ventana = ventana;
		this.modelo = modelo;
	}

	/**
	 * Metodo que espera una accion de algun elemento de una ventana dado por parametro
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String entrada=ventana.getTxtEntrada().getText();
		if(entrada.length()!=1) {
			UtDialogos.dialoError(ventana, "Eso que has introducido no es una letra");
		}else {
			modelo.setLetraUsuario(entrada.charAt(0));
			modelo.compLetr();
			ventana.getLbIntentos().setText("Intentos: "+ (modelo.getINTENTOS()-modelo.getContador()));
			ventana.getLbPista().setText("Pista: "+modelo.imprimirPista(modelo.getPista()));
			modelo.comprobarResultado(ventana, modelo, ventana);
			ventana.getTxtEntrada().setText("");
		}
		ventana.getTxtEntrada().requestFocus();
	}

}
