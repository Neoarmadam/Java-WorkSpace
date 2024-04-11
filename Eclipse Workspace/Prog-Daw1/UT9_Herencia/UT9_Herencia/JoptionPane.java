package UT9_Herencia;
	import javax.swing.JOptionPane;
public class JoptionPane {
	public static void main(String[] args) {
		//pedirEntero("Dame tu edad");
		//pedirLong("Dame un buen numero");
		pedirFloat("Dame un numero");
	}

	private static int pedirEntero(String mensaje) {
		String respuesta;
		int num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(mensaje);
			try {
				num=Integer.parseInt(respuesta);
				repetir=false;
				//return num;
			}catch(NumberFormatException e) { //Exception
				JOptionPane.showMessageDialog(null, "Eso no era un numero", "ERROR", JOptionPane.ERROR_MESSAGE);
				//System.err.println("Me estas inflando los huevos");
				//e.printStackTrace();
				repetir=true;
				//return -444;
			}
		}while(repetir);
		return num;
		//num=Integer.parseInt(mensaje);
		//JOptionPane.showMessageDialog(null, num, "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static long pedirLong(String mensaje) {
		String respuesta;
		long num=0;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(mensaje);
			try {
				num=Long.parseLong(respuesta);
				repetir=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Eso no era un numero", "ERROR", JOptionPane.ERROR_MESSAGE);
				repetir=true;
			}
		}while(repetir);
		return num;
	}

	private static float pedirFloat(String mensaje) {
		String respuesta;
		float num=0.1f;
		boolean repetir=false;
		do {
			respuesta=JOptionPane.showInputDialog(mensaje);
			respuesta = respuesta.replaceAll(",",".");
			try {
				num=Float.parseFloat(respuesta);
				repetir=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Eso no era un numero", "ERROR", JOptionPane.ERROR_MESSAGE);
				repetir=true;
			}
			
		}while(repetir);
		return num;
	}
}