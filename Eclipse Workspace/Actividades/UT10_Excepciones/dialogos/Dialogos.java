package dialogos;
	import java.util.StringTokenizer;
	import javax.swing.JOptionPane;

public class Dialogos {
	public final static int OPCION_ACEPTAR=JOptionPane.OK_OPTION;
	public final static int OPCION_CANCELAR=JOptionPane.CANCEL_OPTION;
	/**Pide numero de tipo entero, si no se da un parametro de este tipo lo volvera a pedir
	 * 
	 * @param mensaje a mostrar en el cuadro de dialogo
	 * @throws ninguna excepcion
	 * @return
	 */
	public static int dialoPedirEntero(String mensaje) {
		String respuesta;
		int num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(mensaje);
			try {
				num=Integer.parseInt(respuesta);
			}catch(NumberFormatException e){
				dialoError("Eso no es un numero");
			}
		}while(repetir);
		return num;
	}
	
	/**Pide numero de tipo double, si no se da un parametro de este tipo lo volvera a pedir
	 * 
	 * @param mensaje a mostrar en el cuadro de dialogo
	 * @return
	 */
	public static double dialoPedirdouble(String mensaje) {
		String respuesta;
		double num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(mensaje);
			try {
				respuesta = respuesta.replaceAll(",",".");
				num=Double.parseDouble(respuesta);
			}catch(NumberFormatException e){
				dialoError("Eso no es un numero");
			}
		}while(repetir);
		return num;
	}
	
	/**Pide numero de tipo Long, si no se da un parametro de este tipo lo volvera a pedir
	 * 
	 * @param mensaje a mostrar en el cuadro de dialogo
	 * @return
	 */
	public static long dialoPedirLong(String mensaje) {
		String respuesta;
		long num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(mensaje);
			try {
				num=Long.parseLong(respuesta);
			}catch(NumberFormatException e){
				dialoError("Eso no es un numero");
			}
		}while(repetir);
		return num;
	}
	
	/**Pide una cadena de tipo String, si no se da un parametro de este tipo lo volvera a pedir
	 * 
	 * @param mensaje a mostrar en el cuadro de dialogo
	 * @return
	 */
	public static String dialoPedirString(String mensaje) {
		String respuesta;
		respuesta=JOptionPane.showInputDialog(mensaje);
		return respuesta;
	}
	
	/**
	 * Mostrar cuadro de dialogo de error
	 * @param mensaje el mensaje a mostrar en el cuadro
	 */
	public static void dialoError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Mostrar cuadro de dialogo de advertencia
	 * @param mensaje el mensaje a mostrar en el cuadro
	 */
	public static void dialoWarning(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Atencion", JOptionPane.WARNING_MESSAGE);
	}
		
	
	public static void dialoMensaje(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	/**
	 * Mostrar cuadro de Aceptar, Cancelar y devolver la opcion por un int
	 * @param mensaje
	 * @return
	 */
	public static int dialoAceptarCancelar(String mensaje) {
		int opcion=JOptionPane.showConfirmDialog(null, mensaje, "seguro", JOptionPane.OK_CANCEL_OPTION);
		/*if(opcion==JOptionPane.YES_OPTION) {
			Dialogos.dialoMensaje("Has dicho si");
		}else {
			Dialogos.dialoMensaje("Has dicho no");
		}*/
		return opcion;
	}
}