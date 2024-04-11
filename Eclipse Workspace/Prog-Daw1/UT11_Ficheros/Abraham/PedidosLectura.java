 package Abraham;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PedidosLectura {
	public static void main(String[] args) {
		double aux1, aux2;
		double total=0;
		
		try {
			DataInputStream entrada = new DataInputStream(new FileInputStream("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\pedido.abra"));
			String pedido=entrada.readUTF();
			while(pedido!=null) { //while(true) bucle infinito que para en la excepcion
				pedido+=" - ";
				aux1=entrada.readInt();
				pedido+=aux1+" - ";
				aux2=entrada.readDouble();
				total+=aux1*aux2;
				pedido+=aux2;
				
				System.out.println(pedido);
				pedido=entrada.readUTF();
			}
			
			
		}catch(EOFException eof) {
			System.out.println("Fichero terminado");
			System.out.println("Total a pagar "+total);
		}catch(IOException e) {
			System.out.println("Error de entrada/salida");
		}
	}
}
