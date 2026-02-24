import java.util.Scanner;

public class CalcularJornada.java {
    public static void main (String[] args) {
       Scanner    sc = new Scanner(System.in);
        System.out.println("Introduce el turno (diurno/nocturno): ");
        String turno = sc.nextLine().toLowerCase();

        System.out.print("¿Es domingo? (si/no): ");
        String domingo = sc.nextLine().toLowerCase();

        System.out.print("Introduce el número de horas trabajadas: ");
        int horas = sc.nextInt();

        double tarifa = 0;

        if (turno.equals("diurno")) {
            tarifa = 5;
            if (domingo.equals("si")) {
                tarifa += 2; // Domingo: +2€ turno diurno
            }
        } else if (turno.equals("nocturno")) {
            tarifa = 8;
            if (domingo.equals("si")) {
                tarifa += 3; // Domingo: +3€ turno nocturno
            }
        } else {
            System.out.println("Turno no válido.");
            return;
        }

        double jornal = tarifa * horas;

        System.out.println("---------------------------");
        System.out.println("Turno:    " + turno);
        System.out.println("Domingo:  " + domingo);
        System.out.println("Horas:    " + horas);
        System.out.println("Tarifa:   " + tarifa + " €/hora");
        System.out.println("Jornal:   " + jornal + " €");
        System.out.println("---------------------------");

        sc.close();
    }
}
