package vnos_operacija_izpis;

import java.util.Scanner;
//  Oddaljenost dveh točk
public class Naloga1_9 {
    private static double sqrt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi x1:");
        double x1 = scanner.nextDouble();

        System.out.println("Vnesi y1:");
        double y1 = scanner.nextDouble();

        System.out.println("Vnesi x2:");
        double x2 = scanner.nextDouble();

        System.out.println("Vnesi y2:");
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("Oddaljenost je:" + distance);
    }
}
