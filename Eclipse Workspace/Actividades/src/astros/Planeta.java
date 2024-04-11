package astros;

public class Planeta {
	/**Atributos Objeto Paneta**/
	final double CONST_GRAV=Math.pow(10, -11)*6.67;
	private double masa;	//Tiene que ser en KG
	private double radio; //Tiene que ser KM
	private String nombre;
	private int numLunas;
	private double distSol;
	private double rotacionSolar;
	boolean habitado;
	
	
	public void rellenarPlaneta(double masa, double radio, String nombre, int lunas, double distSol, double rotacionSolar, boolean habitado) {
		this.setMasaPlaneta(5.972*Math.pow(10, 24));
		this.setRadioPlaneta(6371000);
		this.setNombrePlaneta("Tierra");
		this.setDistSol(1);
		this.setHabitado(true);
		this.setNumLunas(1);
	}
	
	

	/**Set**/
	//Set Masa
	public void setMasaPlaneta(double setMasa) {
		if(setMasa>0) {
			masa=setMasa;
		}else {
			menorCero();
		}
		
	}
	
	//Set Radio
	public void setRadioPlaneta(double setRadio) {
		if(setRadio>0) {
			radio=setRadio;
		}else {
			menorCero();
		}
	}
	
	//Set Nombre
	public void setNombrePlaneta(String setNombre) {
		nombre=setNombre;
	}
	
	//Set Numero de Lunas
	public void setNumLunas(int numLunas) {
		this.numLunas = numLunas;
	}
	
	//Set distancia al sol
	public void setDistSol(double distSol) {
		this.distSol = distSol;
	}
	
	//Set Habitado
	public void setHabitado(boolean habitado) {
		this.habitado = habitado;
	}
	//Set Rotacion Solar
	public void setRotacionSolar(double rotacionSolar) {
		this.rotacionSolar = rotacionSolar;
	}
	
	/**Get**/
	//Get Masa
	public double getMasaPlaneta() {
		return masa;
	}
	
	//Get Radio
	public double getRadioPlaneta() {
		return radio;
	}
	
	//Get Gravedad
	public double getGravedad() {
		double grav=(CONST_GRAV*masa)/Math.pow(radio,  2);
		return grav;
	}
	
	//Get numero Lunas
	public int getNumLunas() {
		return numLunas;
	}

	//Get Distancia al sol
	public double getDistSol() {
		return distSol;
	}

	//Get rotacion solar
	public double getRotacionSolar() {
		return rotacionSolar;
	}
	
	//Get habitado
	public boolean isHabitado() {
		return habitado;
	}
	
	
	
	/**Metodos Adicionales**/
	private void menorCero() {
		System.out.println("Introduce un numero mayor a 0");
	}
	
	public double masa(double masa) {
		masa=masa/getGravedad();
		return masa;
	}


	/**ToString**/
	@Override
	public String toString() {
		return "Planeta [masa=" + masa + ", radio=" + radio + ", nombre=" + nombre + ", numLunas=" + numLunas + ", distSol="
		    + distSol + ", rotacionSolar=" + rotacionSolar + ", habitado=" + habitado + "]";
	}
	

	
}
