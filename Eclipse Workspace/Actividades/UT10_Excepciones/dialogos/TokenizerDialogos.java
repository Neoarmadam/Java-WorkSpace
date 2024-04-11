package dialogos;
	import java.util.StringTokenizer;
public class TokenizerDialogos {
	public static void main(String[] args)  throws ExcepNumPartes{
		final int TAM=3;
		
		String []nombres= new String[5];
		float []pesos= new float[5];
		int []edades=new int[5];
		
		for(int f=0; f<TAM; f++) {
			try {
				dividirPartes(nombres, pesos, edades, f);
			}catch(ExcepNumPartes e){
				Dialogos.dialoError("numero de partes incorrecto");
			}catch(NumberFormatException e) {
				Dialogos.dialoError("Has introducido mal los numeros");
			}
		}
		mostrarDatos(nombres, pesos, edades);
		
		
		
		/*while(partes.hasMoreTokens()) {
			System.out.println(partes.nextToken());
		}*/
	}

	private static void dividirPartes(String[] nombres, float[] pesos, int[] edades, int i) throws ExcepNumPartes {
		String entrada=Dialogos.dialoPedirString("dime la cadena de entrada");
		StringTokenizer partes=new StringTokenizer(entrada,"<");
		if (partes.countTokens()!=3) {
			throw new ExcepNumPartes();
			//System.exit(0);
		}else {
			nombres[i]=partes.nextToken();
			pesos[i]=Float.parseFloat(partes.nextToken());
			edades[i]=Integer.parseInt(partes.nextToken());
		}
	}
	
	private static void mostrarDatos(String[] nombres, float[] pesos, int[] edades) {
		String result="";
		for(int f=0; f<nombres.length; f++) {
			result=result+"/n"+nombres[f]+pesos[f]+edades[f]+"/n";
		}
		Dialogos.dialoMensaje(result);
	}
	
}
