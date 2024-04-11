package Examen_EV2;
	import java.util.Scanner;
import java.util.StringTokenizer;
public class Ejercicio2 {
	public static void main (String args[]){
		//Variables del main
		Scanner sc=new Scanner(System.in);
		String []nomProd; //Hace referencia a nombre produccion
		int []numProd;	//Hace referencia a numero de produccion, el numero producido
		int numDatos; //Numero de datos para introducir
		int opcion;
		
		//Resolucion del main
		numDatos=pedirViñas();
		numProd=new int [numDatos];
		nomProd=new String[numDatos];
		
		do {
			menu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				insertarDatos(numDatos, nomProd, numProd);
				break;
			case 2:
				mostrarDatos(nomProd,numProd);
				break;
			case 3:
				System.out.println(totalKilos(numProd));
				break;
			case 4:
				System.out.println(mediaKilos(numProd));
				break;
			case 5:
				System.out.println(nomProd[mayorPesaje(numProd)]+" "+numProd[mayorPesaje(numProd)]);
				break;
			case 6:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("introduce una opcion valida");
			}
			}while(opcion!=6);
		
	}
	//Metodo para el menu
	public static void menu() {
		System.out.println("1: Insertar datos");
		System.out.println("2: Mostrar datos recogidos");
		System.out.println("3 Mostrar el total de Kilos");
		System.out.println("4: Mostrar media de kilos");
		System.out.println("5: Mostrar el mayor pesaje");
		System.out.println("6: Salir");
	}
	
	//Metodo para pedir Viñas
	public static int pedirViñas() { //metodo principal definido por el ejercicio
		//Variables del Metodo
		Scanner sc=new Scanner(System.in);
		int numDatos;
		
		//Resolucion del Metodo
		System.out.println("Cuantas viñas vamos a recoger?");	
		numDatos=sc.nextInt();
		while(numDatos<1) {
			System.out.println("No se pueden introducir numeros negativos o 0");
			numDatos=sc.nextInt();
		}
		return numDatos;
	}
	
	//Metodo insertar datos
	public static void insertarDatos(int numDatos, String[] nomProd, int[]numProd ) {
		//Variables del metodo
		Scanner sc=new Scanner(System.in);
		StringTokenizer st;
		String datos;
		final int LIM=numDatos;
		
		//Resolucion del metodo
		for (int f=0; f<LIM; f++) {
			System.out.println("Introduce datos");
			datos=sc.nextLine();
			st=new StringTokenizer(datos, ">");
			nomProd[f]=st.nextToken();
			numProd[f]=Integer.parseInt(st.nextToken());
		}
	}
		//Metodo mostrar datos
		public static void mostrarDatos(String[] nomProd, int[]numProd) {
			//Variables del metodo
			int LIM=numProd.length;
			
			//Resolucion del Metodo
			for(int f=0; f<LIM; f++) {
				System.out.println(nomProd[f] +" "+ numProd[f]);
			}
	}
		
		//Total Kilos
		public static int totalKilos(int[]numProd) {
			//Variables del metodo
			int total=0;
			
			//Resolucion del Metodo
			for(int f=0; f<numProd.length; f++) {
				total=total+numProd[f];
			}
			return total;
		}
		
		public static float mediaKilos(int[]numProd) {
		//Variables del metodo
			float media=0;
			
			//Resolucion del Metodo
			media=totalKilos(numProd);
			media=media/numProd.length;
			return media;
		}
		
		public static int mayorPesaje(int[]numProd) {
			//Variables del metodo
			int posMayor=0;
			int mayor=0;
			
			//Resolucion del Metodo
			for(int f=1; f<numProd.length; f++) {
				if(numProd[f]>mayor) {
					posMayor=f;
					mayor=numProd[f];
				}
			}
			return posMayor;
		}
}
