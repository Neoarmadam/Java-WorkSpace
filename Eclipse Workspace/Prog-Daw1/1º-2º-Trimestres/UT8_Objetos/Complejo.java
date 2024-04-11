package UT8_Objetos;
	import java.util.*;
public class Complejo {
	float parteReal, parteImaginaria;
	double i= Math.sqrt(-1);

	
	/**Constructores**/
	public Complejo() {
		parteReal=5;
		parteImaginaria=5;
	}
	
	public void Complejo(float setParteReal, float setParteImaginaria) {
		parteReal=setParteReal;
		parteImaginaria=setParteImaginaria;
	}
	
	public void imprimirForma() {
		System.out.println(parteReal+parteImaginaria*i);
	}
	public void sumar(float num) {
		parteReal=parteReal+num;
		parteImaginaria=parteImaginaria+num;
		System.out.println(parteImaginaria+" "+parteReal);
	}

	
	}
