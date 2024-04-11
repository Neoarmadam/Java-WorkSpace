package david;

public class AsteriscosApp {
	public static void main(String args[]) {
		
		DibujaAsteriscos ast1= new DibujaAsteriscos();
		DibujaAsteriscos ast2= new DibujaAsteriscos('j');
		DibujaAsteriscos ast3= new DibujaAsteriscos(15,'?');
		ast1.dibujar();
		ast2.dibujar();
		ast3.dibujar();
	}
}
