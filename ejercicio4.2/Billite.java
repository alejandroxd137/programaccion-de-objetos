import java.util.Scanner;

public class Billite {
     public static void main (String[] args) {
       Scanner    sc = new Scanner(System.in);
        System.out.println( "Introduce la distancia a recorrer en (km): ");
        double distancia = sc.nextDouble();
        System.out.println( "Introduce la duracion de la estancia (dias): ");
        int diasEstancia = sc.nextInt();
        double precioTotal = 2.5 * distancia;
        if (distancia > 800 && diasEstancia > 7) {
            precioTotal =precioTotal - precioTotal * 0.3;
            System.out.println( "Se aplica un descuento  del 30%;");
            System.out.printf( "El precio del billete: %.2f euros%n", precioTotal);

            scanner.close();
         {

}
