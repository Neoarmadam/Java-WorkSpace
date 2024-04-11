import AhorGrafico.UtDialogos;

public class Ahorcado {
	static String palabraOculta;
	
	public static void main(String[] args) {
		final int INTENTOS=7;
		final int ACIERTOS=5;
		String palabras[]= {"penes", "duras", "leche", "zorra"};
		int contador=0;
		int contadorAciertos=0;
		char letraUsuario;
		char pista[]= {'*','*','*','*','*'};
		boolean cambio=false;
		String aux;
		int numero=0;
		
		for(int f=0; f<5; f++) {
			numero=(int)(Math.random()*4);
		}
		
		palabraOculta=palabras[numero];
		while (INTENTOS>contador && ACIERTOS>contadorAciertos) {
			letraUsuario=UtDialogos.dialoPedirString("Dime letra, tienes "+(INTENTOS-contador)+" intentos").charAt(0);
			cambio=false;
			for (int f=0;f<palabraOculta.length();f++){
				if(palabraOculta.charAt(f)==letraUsuario) {
					cambio=true;
					if(pista[f]!=letraUsuario) {
						contadorAciertos++;
						cambio=true;
					}
					pista[f]=letraUsuario;
				}
			}
			if(!cambio) {
				contador++;
			}
			ImprimirPista(pista);
		}
		
		comprobarResultado(ACIERTOS, contadorAciertos);
		
		
		
	}

	private static void comprobarResultado(final int ACIERTOS, int contadorAciertos) {
		if (contadorAciertos==ACIERTOS) {
			UtDialogos.dialoMensaje("Acertaste");
		}else {
			UtDialogos.dialoError("Pal pozo");
		}
	}

	private static void ImprimirPista(char[] pista) {
		for(int f2=0;f2<pista.length; f2++) {
			System.out.print(pista[f2]);
		}
		System.out.println();
	}
	
	public static void pedirPalabraOculta() {
		palabraOculta=UtDialogos.dialoPedirString("Dime una palabra de 5 letras");
	}
}
