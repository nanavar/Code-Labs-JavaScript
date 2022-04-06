package vnos_operacija_izpis;

import java.util.Scanner;
//  Izračunaj hitrost
class Naloga1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi pot: ");
        double x = scanner.nextDouble();
        System.out.println("Vnesi cas: ");
        int t = scanner.nextInt();

        double v = x/t;

        System.out.println("Hitrost je: " + v + "m/s");
    }
}