package Examen_EV2;
	import java.util.Scanner;
public class Manzana {
	private int peso; //en miligramos
	private String color;
	
	
	public Manzana(int peso, String color) {
		this.peso = peso;
		this.color = color;
	}

	public Manzana() {
		Scanner sc=new Scanner(System.in);
		color=sc.nextLine();
		peso=sc.nextInt();
		while(peso<1) {
			System.out.println("Color no valido");
			peso=sc.nextInt();
		}
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
