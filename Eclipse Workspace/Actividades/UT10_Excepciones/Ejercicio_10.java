import javax.swing.JOptionPane;

public class Ejercicio_10 {
	public static void main(String[] args) {
		int[] numeros=new int[5];
		
		/*try {*/
			numeros[0]=pedirEntero("Dame un numero");
		/*}catch(Exception e) {
			System.err.println("Cierro la batileche");
			System.exit(0);
		}*/
	
	}
	
	private static int pedirEntero(String mensaje) {
		String respuesta;
		int num=0;
		
		respuesta=JOptionPane.showInputDialog(mensaje);
		try {
			num=Integer.parseInt(respuesta);
		}catch(Exception e){
			System.err.println("Error");
			throw e;
		}
		
		return num;
		
	}
}
