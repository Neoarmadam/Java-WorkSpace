package Ejercicio_21;
	import java.util.ArrayList;
	import Ejercicio_21.Empleado;
import Utilidades.UtDialogos;

public class Ejercicio_21 {
	public static void main(String[] args) {
		ArrayList<Empleado> Empleados=new ArrayList<Empleado>();
		
		menu(Empleados);
		
		
	}
	
	public static void menu(ArrayList<Empleado> Empleados) {
		boolean seguir=true;
		int op;
		UtDialogos.dialoMensaje("Elige entre las opciones 1 Añadir, 2 Eliminar o 3 mostrar empleados");
			while(seguir) {
				op=UtDialogos.dialoPedirEntero("Elija entre las opciones: 1, 2 y 3. En otro caso me cerrare");
				switch (op) {
				case 1:
					pedirEmpleados(Empleados);
					break;
				case 2:
					borrarEmpleados(Empleados);
					break;
				case 3:
					imprimirLista(Empleados);
					break;
				default:
					seguir=false;
					break;
				}
			}
	}
	/**
	 * Metodo para borrar empleados de un arraylist
	 * @param Empleados
	 */
	private static void borrarEmpleados(ArrayList<Empleado> Empleados) {
		String nombre;
		int seguir=0;
		int lim=Empleados.size();
		boolean encontrado=false;
		while(seguir==0) {
			nombre=UtDialogos.dialoPedirString("Dame el nombre del empleado a eliminar");
			for (int f=0; f<lim; f++) {
				if (nombre.equalsIgnoreCase(Empleados.get(f).getNombre())) {
					Empleados.remove(f);
					break;
				}
			}
			seguir=UtDialogos.dialoAceptarCancelar("¿Desea seguir eliminando empleados?");
		}
	}

	/**
	 * Metodo que rellena un ArrayList de tipo empleados
	 * @param Empleados
	 */
	private static void pedirEmpleados(ArrayList<Empleado> Empleados) {
		int num;
		String nombre;
		int seguir=0;
		while(seguir==0) {
			nombre=UtDialogos.dialoPedirString("Dame el nombre del empleado");
			num=UtDialogos.dialoPedirEntero("Dame el numero de la seguridad social de ese empleado");
			Empleados.add(new Empleado(nombre, num));
			seguir=UtDialogos.dialoAceptarCancelar("¿Desea seguir añadiendo empleados?");
		}
	}
	
	/**
	 * Imprime un array list dado por parametro
	 * @param lista
	 */
	private static void imprimirLista(ArrayList lista) {
		//Escribir ArrayList
		for(int f=0; f<lista.size();f++) {
			//lista[f]
			System.out.println(lista.get(f));
		}
		System.out.println("--------------------");
	}
}
