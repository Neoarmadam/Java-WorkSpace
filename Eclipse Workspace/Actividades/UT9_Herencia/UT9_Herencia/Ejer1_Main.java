package UT9_Herencia;
	import java.util.Scanner;
public class Ejer1_Main {
	public static void main (String args[]) {
		//Variables del Main
		final int LIMEMP=0;
		final int LIMJEF=1;
		Ejer1_Empleados[] empleados=new Ejer1_Empleados[LIMEMP];
		Ejer1_Jefe[] jefes=new Ejer1_Jefe[LIMJEF];
		/*
		//Resolucion del main
		rellenarEmps(empleados);
		rellenarJefes(jefes);
		*/
		
		jefes[0]=new Ejer1_Jefe();
		escribirEmpleados(empleados);
		escribirJefes(jefes);
	}
	
	/**Metodo Rellenar Empleados**/
	public static void rellenarEmps(Ejer1_Empleados[] empls) {
		//Variables del metodo
		final int LIM=empls.length;
		Scanner sc=new Scanner(System.in);
		
		//Resolucion del metodo
		for(int f=0; f<LIM; f++) {
			empls[f]=new Ejer1_Empleados();
			System.out.println("--------------------------------------------------------");
			System.out.println("Vamos a introducir los datos del "+(f+1)+"º empleado");
			System.out.println("Dame el nombre");
			empls[f].setNombre(sc.nextLine());
			System.out.println("Introduce el sueldo");
			empls[f].setSueldo(sc.nextInt());
			sc.nextLine();
		}
		//sc.close(); Da error en tiempo de ejecucion
	}
	
	/**Metodo para rellenar Jefes**/
	public static void rellenarJefes(Ejer1_Jefe[] jefes) {
		//Variables del metodo
		final int LIM=jefes.length;
		Scanner sc=new Scanner(System.in);
		
		//Resolucion del metodo
		for(int f=0; f<LIM; f++) {
			jefes[f]=new Ejer1_Jefe();
			System.out.println("--------------------------------------------------------");
			System.out.println("Vamos a introducir los datos del "+(f+1)+"º jefe");
			System.out.println("Dame el nombre");
			jefes[f].setNombre(sc.nextLine());
			System.out.println("Introduce el sueldo");
			jefes[f].setSueldo(sc.nextInt());
			sc.nextLine();
			System.out.println("Dame el nombre de su titulo");
			jefes[f].setTitulo(sc.nextLine());
			System.out.println("Dame el nombre del departamento que dirige");
			jefes[f].setDepartemento(sc.nextLine());
		}
		//sc.close();
	}
	
	/**Metodo para escribir Empleados**/
	public static void escribirEmpleados(Ejer1_Empleados[] empls) {
		for(int f=0; f<empls.length; f++) {
			System.out.println(empls[f].toString());
		}
	}
	
	/**Metodo para escribir Jefes**/
	public static void escribirJefes(Ejer1_Jefe[] jefes) {
		for(int f=0; f<jefes.length; f++) {
			System.out.println(jefes[f].toString());
		}
	}
}

