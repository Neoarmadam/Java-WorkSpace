
public class ExcepcionRango extends Exception{

	public ExcepcionRango(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionRango() {
		super("Estas fuera del rango");
	}
	
}
