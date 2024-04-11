package UT7_Metodos;
	import java.util.Scanner;
public class Armada_Neo__PRacMetodos {
	public static void main (String args[]) {
		/**Variables del Main**/
		Scanner sc=new Scanner(System.in);
		String[] emisoras= {"Sony","Nintendo","Xbox","PC"};
		int[] encuesta=new int[emisoras.length];
		int menu;
		
		/**Resolucion del Main**/
		menuInicial();
		menu=menu(sc);		
		while(menu!=3) {
			if (menu==1) {
				pedirDatos(sc, emisoras, encuesta);
			}else {
				menu=menuConsultas(sc, menu);
				while(menu!=4) {
					if (menu==1) {
						ordenarCadenas(emisoras, encuesta);
						mostrarEncuesta(emisoras, encuesta);
					}else if(menu==3) {
						mostrarEncuestaPorc(sc, emisoras, encuesta);
					}else if(menu==2) {
						ordenarCadenas(emisoras, encuesta);
						mostrarEncuestaConPorc(emisoras, encuesta);
					}
					menu=menuConsultas(sc, menu);
				}
			}//fin opcion consultas
			menu=menu(sc);
			if (menu==1) {
				inicializarEncuesta(encuesta);
				//Limpiar estadisticas
			}
		}//fin del while del primer menu
	}//Fin Main
	
	
	static void menuInicial() {
		/**Resolucion**/
		System.out.println("Esto es una encuesta para ver que emisora es la fav de los usuarios");
		System.out.println("Las emisoras encuestadas son: Sony, Nintendo, Xbox y PC");
		System.out.println();
	}
	
	
	static int menuConsultas(Scanner sc, int menu) { //Menu para elegir el tipo de consulta
		/**Resolucion**/
		System.out.println("-----Menu Consultas-----");
		System.out.println("1: Mostrará las cadenas ordenadas por orden descendente de oyentes");
		System.out.println("2: Mostrará las cadenas ordenadas por orden descendente de oyentes, mostrando el porcentaje.");
		System.out.println("3: Pedirá una cadena de radio al usuario con el fin de visualizar cuántas personas escuchan "
				+ "esa cadena de radio y que porcentaje del total supone.");
		System.out.println("4: Salir");
		menu=sc.nextInt();
		while (menu<1 || menu>4) {
			System.out.println("error, vuelva a introducir");
			menu=sc.nextInt();
		}
		return menu;
	}//Fin menu Consultas
	
	
	static void inicializarEncuesta(int[] encuesta) {
		/**Resolucion**/
		for (int f=0; f<encuesta.length; f++) {
			encuesta[f]=0; 
		}
	}//Fin Inicializar encuesta
	
	
	static int menu(Scanner sc) { //menu para pedir datos o hacer consultas
		/**Variables**/
		int menu=0;
		
		/**Resolucion**/
		do {
			System.out.println("-----Menu-----");
			System.out.println("Elija una de ls siguientes opciones para seguir la encuesta:");
			System.out.println("1-Insertar datos");
			System.out.println("2-Hacer consultas");
			System.out.println("3-Salir");
			menu=sc.nextInt();
			if (menu<1 || menu>3) {
				System.out.println("Numero no valido, vuelva a intentarlo");
			}
		}while(menu<1 || menu>3);
		return menu;
	}//fin menu
	
	
	static void mostrarEncuestaConPorc(String[] emisoras, int[] encuesta){ //Menu para hacer la segunda consulta
		/**Resolucion**/
		for(int f=0; f<emisoras.length; f++) {
			System.out.println("-------------------");
			System.out.print(emisoras[f]+": "+encuesta[f]);
			if(encuesta[f]==0) { //Evitar que explote al hacer calculos con 0
				System.out.println(" con el 0% de los votos");
			}else {
				System.out.println(" con el " +porcentajeEmisora(f, encuesta)+"% votos");
			}
			
		}
	}//fin mostrar encuesta
	
	
	static int[] pedirDatos(Scanner sc, String[] emisoras, int[] encuesta) { //Pedir los datos de la encuesta
		/**Variables**/
		int numPers=0;
		boolean pedirvalido;
		String pedir;
		
		/**Resolucion**/
		do {
			System.out.println("Cuantas personas van a ser encuestadas?");
			numPers=sc.nextInt();
			if (numPers<1) {
				System.out.println("Introduce un numero mayor de 0");
			}
		}while (numPers<1);
		System.out.println("Vamos a entrevistar "+numPers+" personas");
		sc.nextLine();
		for (int f=0; f<numPers; f++) {
			System.out.println("Persona "+(f+1));
			System.out.println("Introduce tu emisora fav");
			pedir=sc.nextLine();
			pedirvalido=false;
			for(int f2=0; f2<emisoras.length; f2++) {
				if (pedir.equalsIgnoreCase(emisoras[f2])) {
					encuesta[f2]++;
					pedirvalido=true;
				}
			}
			if (pedirvalido==true) {
				System.out.println("Datos guardados");
			}else {
				System.out.println("Emisora no encuestada, vuelve a introducirlo");
				f--;
			}
		}
		return encuesta;
	}//Fin pedir datos
	
	
	static void ordenarCadenas(String[] emisoras, int[] encuesta){ //Ordenar vectores
		/**Variables**/
		boolean cambios=false;
		String aux;
		int auxInt;
		final int TAM=encuesta.length;
		
		/**Resolucion**/
		for(int f2=0; f2<TAM; f2++) {
			cambios=false;
			for(int f=0; f<TAM-1-f2; f++) {
				if(encuesta[f]>encuesta[f+1]) {
					//pasar emisora
					aux=emisoras[f+1];
					emisoras[f+1]=emisoras[f];
					emisoras[f]=aux;
					//pasar encuesta
					auxInt=encuesta[f+1];
					encuesta[f+1]=encuesta[f];
					encuesta[f]=auxInt;
					cambios=true;
				}
			}
		}
	}//Fin Ordenar Cadenas
	
	
	static void mostrarEncuesta(String[] emisoras, int[] encuesta){ //Mostrar la encuesta
		/**Resolucion**/
		System.out.println("-------------------");
		for(int f=0; f<emisoras.length; f++) {
			System.out.println(emisoras[f]+": "+encuesta[f]);
		}
	}//fin mostrar encuesta
	
	
	static void mostrarEncuestaPorc(Scanner sc, String[] emisoras, int[] encuesta){
		/**Variables**/
		boolean encontrada=false;
		String pedir;
		int posicion=-1;
		int porc;
		
		/**Resolucion**/
		sc.nextLine();
		System.out.println("De que emisora quieres saber los datos?");
		pedir=sc.nextLine();
		for(int f=0; f<emisoras.length; f++) {
			if (pedir.equalsIgnoreCase(emisoras[f])) {
				posicion=f;
				encontrada=true;
				break;
			}
		}
		if(encontrada==true) {
			if(encuesta[posicion]==0) { //Si nadie la vota y hacemos calculos con 0, java explota
				System.out.println("Nadie ha votado esa emisora");
			}else {
				porc=porcentajeEmisora(posicion, encuesta);
				System.out.println("-------------------");
				System.out.println(emisoras[posicion]+" con " +encuesta[posicion] +" votos, el " +porc +"#.");
			}
		}else {
			System.out.println("Emisora no reconocida");
		}
	}//Fin mostrarEncuestaPorc
	
	
	static int porcentajeEmisora(int posc, int[] encuesta) { //Calcular porcentaje
		/**Variables**/
		int porc;
		int total=0;
		
		/**Resolucion**/
		for (int f=0; f<encuesta.length; f++) {
			total=total+encuesta[f];
		}
		porc=encuesta[posc]*100/total;
		return porc;
	}
}//Fin clase
