package UT7_Metodos;
	import java.util.Scanner;
public class Actividad_10 {
	public static void main (String args[]) {
		/**Variables**/
		String []ingles;
		String[]español;
		int numParejas;
		int vectorLim;
		
		
		
		numParejas=pedirInt("Dime el numero de parejas para guardar en el diccionario");
		vectorLim=numParejas-1;
		ingles=new String[numParejas];
		español=new String[numParejas];
		rellenarDic(numParejas, español, ingles);
		ordenarDiccionario(español, ingles);
		traducir(español, ingles);
		
		
		
	}//Fin Main
	
	/**Pedir Int**/
	static int pedirInt(String mensaje) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println(mensaje);
		num=sc.nextInt();
		return num;
	}//Fin pedir int
	
	/**Rellenar diccionario**/
	static void rellenarDic(int num, String[] español, String[] ingles) {
		int vectorLim=num-1; //Para inicializar el vector, el 0 cuenta como posicion
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Vamos a rellenar el diccionario con las " +num +" parejas de palabras");
		for (int f=0; f<num; f++) {
			System.out.println("Introduce la " +(f+1) +" pareja");
			System.out.println("Introduce la palabra en español");
			español[f]=sc.nextLine();
			System.out.println("Introduce su traduccion al ingles");
			ingles[f]=sc.nextLine();
		}
	}//Fin rellenar diccionario
	
	/**Devolver traducion**/
	static void traducir(String[] español, String[] ingles) {
		String fin="fin";
		Scanner sc=new Scanner(System.in);
		String cadena;
		
		System.out.println("Voy a traducir tus palabran en ingles con nuestra base de datos");
		System.out.println("Utiliza 'fin' para acabar");
		while(1==1) {
			System.out.println("Introduce palabra para traducir");
			cadena=sc.nextLine();
			int lim=español.length;
			if(cadena.equalsIgnoreCase(fin)) {
				System.out.println("Finalizar Programa");
				break;
			}else {
				for (int f=0; f<lim; f++) {
					if (ingles[f].equalsIgnoreCase(cadena)) {
						System.out.println(español[f]+ ", es la traducion");
						break;
					}else {
						System.out.println("Traduccion no disponible");
					}
				}
			}
		}
	}//Fin devolver traducion
	
	/**Ordenar Vectores**/
	static String[] ordenarDiccionario(String[] español, String[] ingles) {
		boolean cambios=false;
		String aux;
		int tam=español.length;
		int valor;
		
		for(int f2=0; f2<tam; f2++) {
			cambios=false;
			for(int f=0; f<tam-1-f2; f++) {
				valor=ingles[f].compareTo(ingles[f+1]);
				//contador=contador+1;
				if(valor<0) {
					//pasar ingles
					aux=ingles[f+1];
					ingles[f+1]=ingles[f];
					ingles[f]=aux;
					//pasar español
					aux=español[f+1];
					español[f+1]=español[f];
					español[f]=aux;
					
					cambios=true;
				}
				}
			if(cambios==false) {
				break;
			}
		}
		return español;
	}//fin ordenar diccionario
	
}
