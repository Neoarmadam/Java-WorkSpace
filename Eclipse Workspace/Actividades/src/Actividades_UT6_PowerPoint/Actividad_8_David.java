package Actividades_UT6_PowerPoint;
	import java.util.Scanner;
public class Actividad_8_David {
  public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    String buscada;
    String buscar;
    int posicion=0, cont=0;

    System.out.println("Dame una cadena para buscar dentro de ella");
    buscada=teclado.nextLine();
    System.out.println("Dame una cadena para buscar dentro de la anterior");
    buscar=teclado.nextLine();

    while(posicion !=-1){
        posicion=buscada.indexOf(buscar,posicion);
        if(posicion!=-1){
            posicion++;
            cont++;
            System.out.println("La cadena " +buscar+ " aparece en la posicion " +posicion);
    }else
        System.out.println("no hay mas");

}
    System.out.println("aparece " +cont+ " veces");
}
}
