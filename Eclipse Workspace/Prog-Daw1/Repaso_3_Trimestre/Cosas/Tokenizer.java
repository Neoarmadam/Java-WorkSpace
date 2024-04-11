package Cosas;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tokenizer {
	public static void main(String[] args) {
		String st="Neo<<Carlos<<Peripalo";
		StringTokenizer tk;
		ArrayList<String> lista= new ArrayList<String>();
		
		tk= new StringTokenizer(st, "<<");
		
		lista.add(tk.nextToken());
		lista.add(tk.nextToken());
		lista.add(tk.nextToken());
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
	}
}
