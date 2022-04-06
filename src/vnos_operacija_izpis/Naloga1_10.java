package vnos_operacija_izpis;

import java.util.Scanner;
//  Kot urnega kazalca
public class Naloga1_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi uro:");
        int h = scanner.nextInt();

        System.out.println("Vnesi minute:");
        int min = scanner.nextInt();

        System.out.println("Vnesi sekunde:");
        int sek = scanner.nextInt();

        if (h == 1)
            h = 0;
        if (min == 60)
            min = 0;
        if (sek == 60)
            sek = 0;

        int s = sek + min * 60 + h * 60 * 60;

        double x = (360.0 * s) / (12.0 * 3600);

        System.out.println("Kot je:" + x);
    }
}
