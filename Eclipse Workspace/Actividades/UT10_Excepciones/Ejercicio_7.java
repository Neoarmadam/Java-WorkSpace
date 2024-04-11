	import java.io.File;
	import java.io.FileReader;
	import javax.swing.JOptionPane;
public class Ejercicio_7 {
	public static void main(String[] args) {
		String dividendo, divisor, resultado; 
		int resultadoInt, dividendoInt, divisorInt;
		
		
		
		pedirEntero2();
		
	}
	
	private static int pedirEntero2() {
		String dividendo;
		int dividendoInt;
		try {
			dividendo=JOptionPane.showInputDialog("Dame el dividendo");
			dividendoInt=Integer.parseInt(dividendo);
			return dividendoInt;
		}catch(Exception e) {
			System.err.println("Error");
			return -444;
		}
	}
/*
	public void cargarFichero() throws NumberFormatException{
		File fichero=new File("./prueba.txt");
		FileReader fileReader=new FileReader(fichero);
	}*/
}
