package PreparacionExamenEv2;
	import java.util.Scanner;
public class AppPersona {
	public static void main (String args[]) {
		//Variables
		Scanner sc=new Scanner(System.in);
		char letra;
		Persona david=new Persona();
		//Resolucion
		david.pedirDatosTokenizer("David+Cerezo+Hernandez+35+72.5+1.76+98712345+D+H");
		david.pedirSexo();
		System.out.println(david.toString());
		System.out.println(imc(david));
		nivelObeso(david);
	}
	
	public static float imc(Persona per) {
		float imc;
		float peso=per.getPeso();
		float altura=per.getAltura();
		imc=(float) (peso/Math.pow(altura, 2));
		return imc;
	}
	
	public static void nivelObeso(Persona per) {
		float imc=imc(per);
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
	public static void comprobarDNI(Persona per) {
		int numDNI=per.getIntDNI();
		char letDNI=per.getCharDNI(), letraVerificada;
		int resto=numDNI%23;
		switch (resto) {
		case 0:
			letraVerificada='T';
			break;
			
			
		}
			
		
	}
}
