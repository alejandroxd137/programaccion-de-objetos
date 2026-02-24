import java.util.Scanner;

public class Billete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la distancia (km): ");
        double D = sc.nextDouble();

        System.out.print("Introduce la duración de la estancia (días): ");
        int E = sc.nextInt();

        double PT = 2.5 * D;

        if (D > 800 && E > 7) {
            PT = PT - PT * 30.0 / 100;
        }

        System.out.println("Precio del billete: " + PT + " euros");

        sc.close();
    }
}