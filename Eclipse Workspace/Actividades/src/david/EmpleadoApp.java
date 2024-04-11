package david;

public class EmpleadoApp {
	public static void main(String[] args) {
		Empleados emp1=new Empleados();
		Empleados emp2=new Empleados("Alvaro", 21);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}
}
