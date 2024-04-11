package Actividades;
	import java.util.concurrent.TimeUnit;
	//Ejercicio Crono
public class EjercicioCrono {
	public static void main (String args[]) throws InterruptedException {
		//Variables
		int horas1=0;
		int horas2=0;
		int minutos1=0;
		int minutos2=0;
		int segundos1=0;
		int segundos2=0;
		
		//Resolucion
		do {
			
			//Modo cerdo para "borrar" consola
			for (int f=0; f<10; f++) { 
				System.out.println();
			}
		
			//Codigo del Cronometro
			System.out.println("" +horas2 +horas1 +":" +minutos2 +minutos1 +":" +segundos2 +segundos1);
			segundos1+=1;
			if(segundos1==10) {
				segundos2+=1;
				segundos1=0;
			}
			if(segundos2==6) {
				minutos1+=1;
				segundos2=0;
			}
			if(minutos1==10) {
				minutos2+=1;
				minutos1=0;
			}
			if(minutos2==6) {
				horas1+=1;
				minutos2=0;
			}
			if(horas1==10) {
				horas2+=1;
			}
			TimeUnit.SECONDS.sleep(1);
			//Fin codigo Cronometro
			
		}while (horas2<=5); //do while para poder hacer avanzar el cronometro
	}
}
