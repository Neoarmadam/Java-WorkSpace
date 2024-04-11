
public class Ejercicio_8 {
	public static void main(String[] args) {
		int[] array=new int[2];
		
		try {
			array[4]=3;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
