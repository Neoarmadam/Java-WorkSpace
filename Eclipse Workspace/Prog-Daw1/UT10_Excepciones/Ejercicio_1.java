	import javax.swing.JOptionPane;
public class Ejercicio_1 {
	public static void main(String[] args) {
		String dividendo, divisor, resultado; 
		int resultadoInt, dividendoInt, divisorInt;
		
		
		
		
		try {
			try {
				dividendo=JOptionPane.showInputDialog("Dame el dividendo");
				dividendoInt=Integer.parseInt(dividendo);
			}catch(NumberFormatException e) {
				dividendoInt=0;
				JOptionPane.showMessageDialog(null, "Eso no era un numero, era una letra", "ERROR", JOptionPane.ERROR_MESSAGE);
				//e.printStackTrace(); //Capturar el tipo de error
			}
			
			divisor=JOptionPane.showInputDialog("Dame el divisor");
			divisorInt=Integer.parseInt(divisor);
			resultadoInt=dividendoInt/divisorInt;
			System.out.println(resultadoInt);
			JOptionPane.showMessageDialog(null, resultadoInt, "Solucion:", JOptionPane.INFORMATION_MESSAGE);
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Eso no era un numero, era una letra", "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace(); //Capturar el tipo de error
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "El divisor no puede ser 0", "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error desconocido, procediendo a formatear Windows", "ERROR", JOptionPane.ERROR_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null, "Viva españa", "ESPAÑA", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
