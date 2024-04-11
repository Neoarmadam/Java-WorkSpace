package AhorGrafico;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * Modelo.java
 * Modelo del proyecto Ahorcado.
 * 
 * @author Neo Armada
 *  @version 1.0 30/5/2023
 */
public class Modelo {
	//Atributos
	/*
	 * palabraOculta: Palabra que se debera adivinar en el juego.
	 * pista: conjunto de char que sera la pista de las letras acertadas del usuario.
	 * INTENTOS: final int de numero de fallos permitidos.
	 * ACIERTOS: final int de numero de aciertos para ganar el juego.
	 * contador: contador de fallos.
	 * contadorAciertos: contador de aciertos.
	 * letraUsuario: letra introducida por el usuario.
	 */
	private static String palabraOculta;
	private static char pista[]= {'*','*','*','*','*'};
	final int INTENTOS=7;
	final int ACIERTOS=5;
	static int contador=0;
	static int contadorAciertos=0;
	static char letraUsuario;
	
	/**
	 * Metodo que compara la letraUsuario con alguna de las letras de la palabra oculta
	 */
	void compLetr() {
		boolean cambio=false;
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
	}
	
	/**
	 * Metodo que deja elegir entre reiniciar el juego o cerrarlo
	 * @param papa
	 * @param modelo
	 * @param ruta
	 * @param ventana
	 */
	void seguir(Component papa,Modelo modelo, String ruta, AhorVent ventana) {
		int op=UtDialogos.dialoAceptarCancelar(papa, "¿Quieres seguir?");
		if(op==UtDialogos.OPCION_ACEPTAR) {
			char []restPista={'*','*','*','*','*'};
			modelo.setContador(0);
			modelo.setContadorAciertos(0);
			modelo.setPalabraOculta(modelo.elegirPalabra(ruta));
			modelo.setPista(restPista);
			ventana.getLbIntentos().setText("Intentos: "+ (modelo.getINTENTOS()-modelo.getContador()));
			ventana.getLbPista().setText("Pista: "+modelo.imprimirPista(modelo.getPista()));
			UtDialogos.dialoMensaje(papa, "Reseteado");
		}else {
			UtDialogos.dialoMensaje(papa, "Adios");
			System.exit(0);
		}
	}
	
	/**
	 * Metodo que guarda la pista de array de char en un string
	 * @param pista
	 * @return String de la pista
	 */
	 String imprimirPista(char[] pista) {
		String palabra="";
		for(int f2=0;f2<pista.length; f2++) {
			palabra+=(pista[f2]);
		}
		return palabra;
	}
	
	 /**
	  * Comprueba si has ganado o has perdido el juego, y procede a decirtelo y ejecutar el metodo seguir
	  * @param papa
	  * @param modelo
	  * @param ventana
	  */
	void comprobarResultado(Component papa,Modelo modelo, AhorVent ventana) {
		String ruta="src//AhorGrafico//palabras5.txt";
		if (modelo.getContadorAciertos()==modelo.getACIERTOS()) {
			UtDialogos.dialoMensaje(papa, "Acertaste");
			seguir(papa,modelo,ruta, ventana);
		}
		if (modelo.getContador()==modelo.getINTENTOS()){
			UtDialogos.dialoError(papa, "Pal pozo");
			seguir(papa,modelo, ruta, ventana);
		}
	}
	
	/**
	 * Metodo que guarda en un arraylist las palabras de un fichero
	 * @param palabras
	 * @param ruta
	 * @return ArrayList
	 */
	ArrayList<String> leerPalabras(ArrayList<String> palabras, String ruta) {
		try {
			//BufferedReader lectorBuffer=new BufferedReader(lectorFich);
			BufferedReader lectorBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(ruta), "utf-8"));
			String linea=lectorBuffer.readLine();
			while(linea!=null) {
				palabras.add(linea);
				linea=lectorBuffer.readLine();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return palabras;
	}
	
	/**
	 * Metodo que elige una palabra aleatoria de un ArrayList que ha sido rellenado por el metodo leerPalabras
	 * @param ruta
	 * @return
	 */
	String elegirPalabra(String ruta) {
		ArrayList<String> palabras=new ArrayList<String>();
		palabras=leerPalabras(palabras, ruta);
		return palabras.get(numAlea(1, palabras.size()));
		
	}
	
	/**
	 * Metodo para conseguir un numero aleatorio entre un maximo y un minimo.
	 * @param minimo
	 * @param maximo
	 * @return int numero aleatorio
	 */
	public int numAlea(int minimo, int maximo) {
		int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

	
	/***Get/Set***/
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Modelo.contador = contador;
	}

	public static int getContadorAciertos() {
		return contadorAciertos;
	}

	public static void setContadorAciertos(int contadorAciertos) {
		Modelo.contadorAciertos = contadorAciertos;
	}

	public static char getLetraUsuario() {
		return letraUsuario;
	}

	public static void setLetraUsuario(char letraUsuario) {
		Modelo.letraUsuario = letraUsuario;
	}

	public int getINTENTOS() {
		return INTENTOS;
	}

	public int getACIERTOS() {
		return ACIERTOS;
	}

	public static char[] getPista() {
		return pista;
	}

	public static void setPista(char[] pista) {
		Modelo.pista = pista;
	}

	public static String getPalabraOculta() {
		return palabraOculta;
	}

	public static void setPalabraOculta(String palabraOculta) {
		Modelo.palabraOculta = palabraOculta;
	}
	
}