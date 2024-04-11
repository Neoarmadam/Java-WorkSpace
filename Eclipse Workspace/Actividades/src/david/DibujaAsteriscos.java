package david;

public class DibujaAsteriscos {
	
	private int numAsteriscos;
	private char caracter;
	
	public DibujaAsteriscos(){
		numAsteriscos=7;
		caracter='*';
		dibujar();////llamamos al metodo desde el constructor para hacerlo al momento
	}
	
	public DibujaAsteriscos(char caracter){
		numAsteriscos=7;
		this.caracter=caracter;
	}
	
	public DibujaAsteriscos(int numero, char caracter){
		this.numAsteriscos=numero;
		this.caracter=caracter;
	}

	public void dibujar() {
		for(int i=0; i<numAsteriscos; i++) {
			System.out.print(caracter);
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Asteriscos [numAsteriscos=" + numAsteriscos + "]";
	}

	public int getNumAsteriscos() {
		return numAsteriscos;
	}

	public void setNumAsteriscos(int numAsteriscos) {
		if(numAsteriscos>0) {
		this.numAsteriscos = numAsteriscos;
		}else {
			this.numAsteriscos=56;
			System.out.println("El número tiene que ser positivo lo pongo a 56");
		}
	}
	

	
}
