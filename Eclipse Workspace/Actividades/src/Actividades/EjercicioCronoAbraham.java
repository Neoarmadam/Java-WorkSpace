package Actividades;
	import java.util.concurrent.TimeUnit;
	//Ejercicio Crono
public class EjercicioCronoAbraham {
	public static void main (String args[]) throws InterruptedException {
		
		for (int horas=0; horas<60;horas++) {
			for (int min=0; min<60;min++) {
				for (int seg=0; seg<60; seg++) {
					System.out.printf("%02d:%02d:%02d", horas, min ,seg);
					//System.out.println(); 
					TimeUnit.SECONDS.sleep(1);
					System.out.print('\r');
				}
			}
		}
	}
}
