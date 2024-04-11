package Actividades;

public class SentenciaSalto {
	public static void main(String args[]) {
		int ind=0;
		
		while (ind<20) {
			if(ind%2==0) {
				ind++;
				continue;
			}else if(ind==3) {
				return;
				
			}else {
				System.out.println(ind);
			}
			ind++;
		}
		System.out.println("Salgo del bucle");
	}
}
