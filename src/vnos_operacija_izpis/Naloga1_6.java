package vnos_operacija_izpis;

import java.util.Scanner;
//  Ničla linearne funkcije
public class Naloga1_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi smerni koeficient:");
        double k = scanner.nextDouble();

        System.out.println("Vnesi začetno vrednost:");
        double y0 = scanner.nextDouble();

        double x = (-y0)/k;

        System.out.println("Funkcija ima ničlo pri x: " + x);
    }
}
