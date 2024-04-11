package ArrayList;

import java.util.ArrayList;

public class ArrayList_1 {
	public static void main(String[] args) {
		ArrayList lista= new ArrayList();
		
		lista.add("Neo");
		lista.add("David");
		
		for(int f=0; f<lista.size(); f++) {
			System.out.println(lista.get(f));
		}
		lista.remove(0);
		
		for(int f=0; f<lista.size(); f++) {
			System.out.println(lista.get(f));
		}
	}
}
