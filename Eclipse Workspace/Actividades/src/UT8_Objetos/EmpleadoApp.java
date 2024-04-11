package UT8_Objetos;

public class EmpleadoApp {
	public static void main(String args[]) {
		Empleado neo= new Empleado();
		
		neo.pedirDatosEmpleado();
		sueldoJusto(neo);
		neo.visualizarDatosEmpleado();
		
	}
	
	public static void sueldoJusto(Empleado emp) {
		float salario=emp.getSalario();
		if (salario<1000) {
			emp.salario=salario*1.5f; //Usar set
		}
	}
}
