	import javax.swing.JOptionPane;
public class Ejercicio_5 {
	public static void main(String[] args) {
		String dividendo, divisor, resultado; 
		int resultadoInt, dividendoInt, divisorInt;
		int contador=0;
		
		
		while(contador<3) {
			try {
				dividendo=JOptionPane.showInputDialog("Dame el dividendo");
				dividendoInt=Integer.parseInt(dividendo);
				divisor=JOptionPane.showInputDialog("Dame el divisor");
				divisorInt=Integer.parseInt(divisor);
				resultadoInt=dividendoInt/divisorInt;
				System.out.println(resultadoInt);
				JOptionPane.showMessageDialog(null, resultadoInt, "Solucion:", JOptionPane.INFORMATION_MESSAGE);
				break;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Eso no era un numero, era una letra", "ERROR", JOptionPane.ERROR_MESSAGE);
				contador++;
				//e.printStackTrace(); //Capturar el tipo de error
			}catch(ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "El divisor no puede ser 0, se para la ejecucion", "ERROR", JOptionPane.ERROR_MESSAGE);
				contador=4;
				//e.printStackTrace();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error desconocido, procediendo a formatear Windows", "ERROR", JOptionPane.ERROR_MESSAGE);
			}finally {
				JOptionPane.showMessageDialog(null, "Viva españa", "ESPAÑA", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (contador==3) {
			JOptionPane.showMessageDialog(null, "Cerramos el programa, eres demasiado lelo", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
