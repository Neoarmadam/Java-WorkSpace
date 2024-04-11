package dialogos;
	import javax.swing.JOptionPane;
public class PruebaDialgos {
	public static void main(String[] args) {
		int numEntero, aux , acumulador=0;
		
		
		do {
			aux=Dialogos.dialoPedirEntero("Dame un numero");
			acumulador+=aux;
		}while(Dialogos.dialoAceptarCancelar("Seguir?")==Dialogos.OPCION_ACEPTAR);
		Dialogos.dialoMensaje("La suma es "+acumulador);
	}
}
