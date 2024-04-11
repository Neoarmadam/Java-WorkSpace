package corregidos;

import java.util.*;

public class Actividad26 {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n=0;

        System.out.println("Introduce números");
        System.out.println("El programa terminara cuando insertes un numero mayor o igual que 10");

        while (n <= 10) {
            System.out.print("Introduce un número: ");
            n = t.nextInt();
        }
        System.out.println("Se ha introducido un numero mayor o igual a 10");
        System.out.println("Ha sido el nimero "+n);
    }
}
	