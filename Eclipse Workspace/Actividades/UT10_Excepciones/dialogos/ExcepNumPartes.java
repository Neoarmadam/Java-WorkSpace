package dialogos;

public class ExcepNumPartes extends Exception{
	public ExcepNumPartes(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExcepNumPartes() {
		super("El numero de partes es incorrecto");
	}
}
