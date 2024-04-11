package corregidos;

import java.util.*;

public class Actividad19 {
public static void main(String[] args) {
    Scanner t= new Scanner(System.in);
    int n;
    System.out.print("Dime un numero del 1 al 7");
    n =t.nextInt();

    switch (n) {
        case 1:
            System.out.println("Hoy es Lunes");
            break;
        case 2:
            System.out.println("Hoy es Martes");
            break;
        case 3:
            System.out.println("Hoy es Miercoles");
            break;
        case 4:
            System.out.println("Hoy es Jueves");
            break;
        case 5:
            System.out.println("Hoy es Viernes");
            break;
        case 6:
            System.out.println("Hoy es Sabado");
            break;
        case 7:
            System.out.println("Hoy es Domingo");
            break;
        default:
            System.out.println("Necesitas que el numero este entre 1 y 7");
    }
}
}