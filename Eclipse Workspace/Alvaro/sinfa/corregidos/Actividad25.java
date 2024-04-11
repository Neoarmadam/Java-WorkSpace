package corregidos;

import java.util.*;

public class Actividad25 {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Dame numeros impores(Si desea acabar el programa inserte un numero par)");
        int n;
        boolean com=true;

        while (com) {
            System.out.print("Introduce un número: ");
            n = t.nextInt();

            if (n % 2 == 0) {
                System.out.println("Introducio un numero par ");
                System.out.println("Se acabo el progrma");
                com=false;
            } else {
                System.out.println("Has introducido un número impar: " + n);
            }
        }
    }
}
