package Pruebas;	//Pone a que package pertenece esta clase
//vamos a probar el funcionamiento de las variables


/*
 * Vamos a probar el funcionamiento de las variables,
 * para ello vamos a declarar e inicializar dos variables.
 * Despues las sumaremos y restaremos mostrando el resultado
 */
public class PruebaVariables {
	//este es el metodo inicial
	public static void main (String args[]) {
		//Delaracion de constante
		final int VELOCIDAD=1500;
		//Declaracion de variables
		int num1, num2; //numeros con los que vamos a jugar
		int result; //resultado de las operaciones
		char letra;
		boolean cierto;
		double doble1, doble2, resultdoble;
		float float1, float2, resultfloat;
		
		//inicializacion de variables
		num1=10;
		num2=3;
		result=0;
		doble1=10;
		doble2=3;
		float1=20.2f;
		float2=50.5f;
		
		//operaciones con variables
		
		//Suma
		result=num1+num2;
		System.out.print("El resultado de sumarlos es: ");
		System.out.println(result);
		
		//Resta
		result=(num1-num2);
		System.out.println("El resultado de restarlos es \""+result+"\"");
		
		//Multiplicacion
		result=num1*num2;
		System.out.println("El resultado de multiplicarlos es "+result);
	
		//Division
		result=num1/num2;
		num1=num1+10;
		System.out.println("El resultado de la division es "+result);
		
		//Operacion Modulo
		result=num1%num2;
		System.out.println("La operacion modulo es "+result);
		
		//Division de numeros con decimales
		resultdoble=doble1/doble2;
		System.out.println("La division exacta es "+resultdoble);
		
		//Division con variables float
		resultfloat=float1/float2;
		System.out.println("La division con float "+resultfloat);
		
		System.out.println("La velocidad de mi mano a la cara a de sinfa es de "+VELOCIDAD +" metros segundos");


	
		
				
	}
}
