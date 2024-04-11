package corregidos;

import java.util.*;

public class Actividad20 {
	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
	    int n;
	    System.out.print("Dime un numero del 1 al 7 -->");
	    n =t.nextInt();

        if (n >= 1 && n <= 5) {
            System.out.println("El día es laborable.");
        } else if (n == 6 || n == 7) {
            System.out.println("El día es festivo.");
        } else {
            System.out.println("Se necesita un numero comprendido entre el 1 y el 7");
        }
    }
}

