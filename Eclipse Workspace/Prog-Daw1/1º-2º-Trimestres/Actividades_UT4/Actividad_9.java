package Actividades_UT4;
/*
 * Explica el codigo que viene a continuacion.
 * Crea un proyecto con este codigo y ejecutalo a ver si has acertado.
 */
public class Actividad_9 {

	public static void main (String args[]) {
		//Inicializa variables.
		float a=11, e=7;
		float b=0, c=0, d=0;
		//Pone las variables "b","c" y "d" a lo que es la varible "a".
		b=c=d=a;
		//Suma las variables "a" y "e" que seria la suma de 11 mas 7.
		System.out.println("Asignacion +=" +(a+=e));
		//Resta las variables "b" y "e" que seria la resta de 11 menos 7.
		System.out.println("Asignacion -=" +(b-=e));
		//Multiplica las variables "c" y "e" que seria la multiplicacion de 11 por 7.
		System.out.println("Asignacion *=" +(c*=e));
		//Divide las variables "d" y "e" que seria la division de 11 entre 7.
		System.out.println("Asignacion /=" +(d/=e));
	}
}
