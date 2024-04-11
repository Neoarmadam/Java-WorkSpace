package UT8_Objetos;

public class Nutricion {
	public static void main (String args[]) {
		
		Persona neo=new Persona();
		neo.setNombre("Neo");
		neo.setAltura(176);
		neo.setPeso(96);
		neo.setEdad(21);
		
		Persona david=new Persona();
		david.setNombre("David");
		david.setAltura(177);
		david.setPeso(73);
		david.setEdad(35);
		
		
		System.out.println(neo.toString());
		System.out.println("Tiene un imc de "+imc(neo));
		salud(imc(neo));
		
		System.out.println(david.toString());
		System.out.println("Tiene un imc de "+imc(david));
		salud(imc(david));
	}
	public static float imc(Persona cli) {
		float alturaM=cli.getAltura()/100;
		float imc=cli.getPeso()/(alturaM*alturaM);
		return imc;
	}
	
	public static void salud(float imc) {
		if (imc<18.5) {
			System.out.println("Es demasiado delgado");
		}else if (imc<24.9) {
			System.out.println("Esta en un buen peso");
		}else if (imc<29) {
			System.out.println("Tiene un poco de sobrepeso");
		}else if (imc<34.9) {
			System.out.println("Tiene sobrepeso");
		}else {
			System.out.println("Es una puta ballena");
		}
		
	}
}
