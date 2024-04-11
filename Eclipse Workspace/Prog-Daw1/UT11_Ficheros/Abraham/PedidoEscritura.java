package Abraham;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PedidoEscritura {
	public static void main(String[] args) {
		double[] precios= {350,400,890,6200,8730};
		int [] unidades = {5,7,12,8,30};
		String [] descripciones= {"cajas de grapas","cajas de lapices","cajas de bolis",
				"carteras","estilograficas2"};
		
		try {
			DataOutputStream salida = new DataOutputStream(new FileOutputStream("D:\\Usuarios\\Neoarmadam\\OneDrive - Educacyl\\Daw\\Programacion\\Ficheros\\pedido.abra"));
			for(int f=0; f<precios.length; f++) {
				salida.writeUTF(descripciones[f]);
				salida.writeInt(unidades[f]);
				salida.writeDouble(precios[f]);
			}
		}catch(IOException e) {
			System.out.println("Error de entrada/salida");
		}
	}
}
