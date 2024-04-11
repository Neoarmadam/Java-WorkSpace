import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class ExcepcionesPropias {
	public static void main(String[] args) throws ExcepcionRango {
		
		try {
			multiplicar(pedirEntero("Dame un numero"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static int pedirEntero(String mensaje) {
		String respuesta;
		int num=0;
		
		respuesta=JOptionPane.showInputDialog(mensaje);
		try {
			num=Integer.parseInt(respuesta);
		}catch(Exception e){
			String msg=e.getMessage();
			StringTokenizer st=new StringTokenizer(msg, ":");
			String aux=st.nextToken();
			System.err.println("Error" +aux +" capturado en el metodo");
			aux=st.nextToken();
			System.err.println("Has escrito "+aux+" en lugar de un numero");
			//throw e;
		}
		
		return num;
		
	}
	
	public static void multiplicar(int numero) throws ExcepcionRango {
		if (numero>50 && numero<100) {
			System.out.println(numero*20);
		}else {
			throw new ExcepcionRango("Chupas verga");
		}
	}
}
