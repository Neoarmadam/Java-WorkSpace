package AhorGrafico;
	import java.awt.Component;
	//import java.util.StringTokenizer;
	import javax.swing.JOptionPane;
	
/**
 * UtDialogos.java
 * La clase UtDialogos es una clase con Utilidades para poder mandar
 * diferentes ventanas de Dialogos mostrando mensajes o pidiendo
 * datos al usuario.
 * 
 * @author Neo Armada
 * @version 2.0 27/05/2023
 */
public class UtDialogos {
	//Variables de la clase, hacen de auxiliar para algunos metodos.
	public final static int OPCION_ACEPTAR=JOptionPane.OK_OPTION;
	public final static int OPCION_CANCELAR=JOptionPane.CANCEL_OPTION;

	/**
	 * Muestra una ventana de dialogo que pide un numero de tipo entero, pide
	 * el numero de manera infinita si no se da el tipo de dato pedido.
	 * @param mensaje Mensaje a mostrar en la ventana de dialogo.
	 * @return Numero tipo int.
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

	/**
	 * Muestra una ventana de dialogo que pide un numero de tipo entero, pide
	 * el numero de manera infinita si no se da el tipo de dato pedido.
	 * @param papa Ventana padre de la que saldra la ventana de dialogo.
	 * @param mensaje Mensaje a mostrar en la ventana de dialogo.
	 * @return Numero tipo int.
	 */
	public static int dialoPedirEntero(Component papa, String mensaje) {
		String respuesta;
		int num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(papa, mensaje);
			try {
				num=Integer.parseInt(respuesta);
			}catch(NumberFormatException e){
				dialoError(papa, "Eso no es un numero");
			}
		}while(repetir);
		return num;
	}

	/**
	 * Muestra una ventana de dialogo que pide un numero de tipo float, pide
	 * el numero de manera infinita si no se da el tipo de dato pedido.
	 * @param mensaje Mensaje a mostrar en la ventana de dialogo.
	 * @return Numero de tipo float.
	 */
	public static double dialoPedirFloat(String mensaje) {
		String respuesta;
		float num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(mensaje);
			try {
				respuesta = respuesta.replaceAll(",",".");
				num=Float.parseFloat(respuesta);
			}catch(NumberFormatException e){
				dialoError("Eso no es un numero");
			}
		}while(repetir);
		return num;
	}

	/**
	 * Muestra una ventana de dialogo que pide un numero de tipo float, pide
	 * el numero de manera infinita si no se da el tipo de dato pedido.
	 * @param papa Ventana padre de la que saldra la ventana de dialogo.
	 * @param mensaje Mensaje a mostrar en la ventana de dialogo.
	 * @return Numero de tipo float.
	 */
	public static double dialoPedirFloat(Component papa, String mensaje) {
		String respuesta;
		float num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(papa, mensaje);
			try {
				respuesta = respuesta.replaceAll(",",".");
				num=Float.parseFloat(respuesta);
			}catch(NumberFormatException e){
				dialoError(papa,"Eso no es un numero");
			}
		}while(repetir);
		return num;
	}

	/**
	 * Muestra una ventana de dialogo que pide un numero de tipo double, pide
	 * el numero de manera infinita si no se da el tipo de dato pedido.
	 * @param mensaje Mensaje a mostrar en la ventana de dialogo.
	 * @return Numero de tipo float.
	 */
	public static double dialoPedirDouble(String mensaje) {
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
	
	/**
	 * Muestra una ventana de dialogo que pide un numero de tipo double, pide
	 * el numero de manera infinita si no se da el tipo de dato pedido.
	 * @param papa Ventana padre de la que saldra la ventana de dialogo.
	 * @param mensaje Mensaje a mostras en la ventana de dialogo.
	 * @return Numero de tipo double.
	 */
	public static double dialoPedirDouble(Component papa, String mensaje) {
		String respuesta;
		double num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(papa, mensaje);
			try {
				respuesta = respuesta.replaceAll(",",".");
				num=Double.parseDouble(respuesta);
			}catch(NumberFormatException e){
				dialoError(papa, "Eso no es un numero");
			}
		}while(repetir);
		return num;
	}

	/**
	 * Muestra una ventana de dialogo que pide un numero de tipo long, pide
	 * el numero de manera infinita si no se da el tipo de dato pedido.
	 * @param mensaje Mensaje a mostrar en la ventana de dialogo.
	 * @return Numero de tipo long.
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
	
	/**
	 * Muestra una ventna de dialogo que pide un numero de tipo long, pide
	 * el numero de manera infinita si no se da el tipo de dato pedido.
	 * @param papa Ventana padre de la que saldra la ventana de dialogo.
	 * @param mensaje Mensaje a mostrar en la ventana dialogo
	 * @returnNumero de tipo long.
	 */
	public static long dialoPedirLong(Component papa, String mensaje) {
		String respuesta;
		long num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(papa, mensaje);
			try {
				num=Long.parseLong(respuesta);
			}catch(NumberFormatException e){
				dialoError(papa, "Eso no es un numero");
			}
		}while(repetir);
		return num;
	}

	/**
	 * Muestra una ventana de dialogo que pide un string.
	 * @param mensaje Mensaje a mostrar en la ventana de dialogo.
	 * @return string.
	 */
	public static String dialoPedirString(String mensaje) {
		String respuesta;
		respuesta=JOptionPane.showInputDialog(mensaje);
		return respuesta;
	}
	
	/**
	 * Muestra una ventana de dialogo que pide un string.
	 * @param papa Ventana padre de la que saldra la ventanan de dialogo.
	 * @param mensaje Mensaje a mostrar en la ventan dialogo.
	 * @return string.
	 */
	public static String dialoPedirString(Component papa, String mensaje) {
		String respuesta;
		respuesta=JOptionPane.showInputDialog(papa, mensaje);
		return respuesta;
	}

	/**
	 * Muestra una ventana de dialogo mostrando un error especificado por parametro.
	 * @param mensaje Mensaje a mostrar en la ventana dialogo.
	 */
	public static void dialoError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Muestra una ventana de dialogo mostrando un error especificado por parametro.
	 * @param papa Ventana padre de la que saldra la ventana de dialogo.
	 * @param mensaje Mensaje a mostrar en la ventan dialogo.
	 */
	public static void dialoError(Component papa, String mensaje) {
		JOptionPane.showMessageDialog(papa, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Muestra una ventana de dialogo mostrando una advertencia 
	 * especificada por parametro.
	 * @param mensaje Mensaje a mostrar en la ventana dialogo.
	 */
	public static void dialoWarning(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Atencion", JOptionPane.WARNING_MESSAGE);
	}
	
	/**
	 * Muestra una ventana de dialogo mostrando una advertencia 
	 * especificada por parametro.
	 * @param papa Ventana padre de la que saldra la ventana de dialogo.
	 * @param mensaje Mensaje a mostrar en la ventana dialogo.
	 */
	public static void dialoWarning(Component papa, String mensaje) {
		JOptionPane.showMessageDialog(papa, mensaje, "Atencion", JOptionPane.WARNING_MESSAGE);
	}
	
	/**
	 * Muestra una ventana de dialogo mostrando un mensaje 
	 * especificado por parametro.
	 * @param mensaje Mensaje a mostrar en la ventana dialogo.
	 */
	public static void dialoMensaje(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	/**
	 * Muestra una ventana de dialogo mostrando un mensaje 
	 * especificado por parametro.
	 * @param papa Ventana padre de la que saldra la ventana de dialogo.
	 * @param mensaje Mensaje a mostrar en la ventana dialogo.
	 */
	public static void dialoMensaje(Component papa, String mensaje){
		JOptionPane.showMessageDialog(papa, mensaje);
	}

	/**
	 * Metodo en desuso y no refinado.
	 * @param mensaje
	 * @return
	 */
	public static int dialoAceptarCancelar(Component papa,String mensaje) {
		int opcion=JOptionPane.showConfirmDialog(papa, mensaje, "seguro", JOptionPane.OK_CANCEL_OPTION);
		/*if(opcion==JOptionPane.YES_OPTION) {
			Dialogos.dialoMensaje("Has dicho si");
		}else {
			Dialogos.dialoMensaje("Has dicho no");
		}*/
		return opcion;
	}
	
} //Fin de la Clase