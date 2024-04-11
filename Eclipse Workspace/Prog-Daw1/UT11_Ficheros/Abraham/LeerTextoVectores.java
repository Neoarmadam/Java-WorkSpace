package Abraham;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LeerTextoVectores {

	public static void main(String[] args) {
		String directorio = "C:\\Ficheros";
		File dir = new File(directorio);
		File fich = new File(dir, "AlumData.txt");
		String nombres[];
		int edades[];
		float notas[];

		int tam = contarLineas(fich);
		
		nombres = new String[tam];
		edades = new int[tam];
		notas = new float[tam];

		relenarVectores(fich, nombres, edades, notas);
		imprimirVectores(nombres, edades, notas);

			
		
	}

	public static void relenarVectores(File fich, String[] nombres, int[] edades, float[] notas) {
		try {
			String leidoStr;
			FileReader readFich1 = new FileReader(fich);
			BufferedReader readBuff1 = new BufferedReader(readFich1);

			for (int i = 0; i < notas.length; i++) {
				leidoStr = readBuff1.readLine();
				StringTokenizer partes = new StringTokenizer(leidoStr);
				//recorro todos los tokens de una linea para convertirlos a cada tipo de dato
				while (partes.hasMoreTokens()) {
					nombres[i] = partes.nextToken();
					edades[i] = Integer.parseInt(partes.nextToken());
					notas[i] = Float.parseFloat(partes.nextToken());
				}
			}
			readBuff1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int contarLineas(File fich) {
		try {
			FileReader readFich = new FileReader(fich);
			BufferedReader readBuff = new BufferedReader(readFich);
			String leidoStr;
			int tam = 0;
			while (readBuff.readLine() != null) {
				tam++;
			}
			readBuff.close();
			return tam;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static void imprimirVectores(String[] nombres, int[] edades, float[] notas) {
		for (int i = 0; i < notas.length; i++) {
			System.out.print(nombres[i]);
			System.out.print("\t" + edades[i]);
			System.out.println("\t" + notas[i]);
		}
	}

}
