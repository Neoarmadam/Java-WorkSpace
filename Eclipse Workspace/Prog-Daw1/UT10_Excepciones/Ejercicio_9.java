import javax.swing.JOptionPane;

public class Ejercicio_9 {
	public static void main(String[] args) {
		int[] numeros=new int[5];
		int result=0;
		int contador=0;
		String respuesta;
		for(int f=0; f<numeros.length; f++) {
			respuesta=JOptionPane.showInputDialog("Dame un numero");
			try {
				numeros[f]=Integer.parseInt(respuesta);
				contador++;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Eso no era un numero, era una letra", "ERROR", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}
		for(int f=0; f<contador; f++) {
			result=result+numeros[f];
		}
		JOptionPane.showMessageDialog(null, result, "Resultado=", JOptionPane.INFORMATION_MESSAGE);
	}
}
