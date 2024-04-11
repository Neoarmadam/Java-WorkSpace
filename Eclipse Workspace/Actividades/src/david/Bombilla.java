package david;

public class Bombilla {
	private int potencia;
	private boolean encendida;
	
	public Bombilla() {
	this.potencia=0;
	this.encendida=false;
	}
	
	public Bombilla(int potencia) {
	this.potencia=potencia;
	this.encendida=false;
	}
	
	public Bombilla(boolean encendida) {
	this.potencia=0;
	this.encendida=encendida;
	}
	
	public Bombilla(int potencia, boolean encendida) {
	this.potencia=potencia;
	this.encendida=encendida;
	}
	
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isEncendida() {
		return encendida;
	}
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}
	@Override
	public String toString() {
		return "Bombilla [potencia=" + potencia + ", encendida=" + encendida + "]";
	}
	
	
}
