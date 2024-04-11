	import javax.swing.JOptionPane;
public class propagarExcepciones {
	public static void main(String[] args) {
		String dividendo, divisor, resultado; 
		int resultadoInt, dividendoInt, divisorInt;
		
		
		try {
			pedirEntero2();
		}catch(Exception e) {
			System.err.println("Corro");
		}
	}
	private static int pedirEntero2() {
		String dividendo;
		int dividendoInt;
		dividendo=JOptionPane.showInputDialog("Dame el dividendo");
		dividendoInt=Integer.parseInt(dividendo);
		return dividendoInt;
	}
}
