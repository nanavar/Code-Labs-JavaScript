package vnos_operacija_izpis;

import java.util.Scanner;
//  Ploščina pravokotnega trikotnika
public class Naloga1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dolžina višine:");
        double visina = scanner.nextDouble();

        System.out.println("Dolžina spodnje katete:");
        double spodnja_kateta = scanner.nextDouble();

        System.out.println("Ploščina je:" + ((visina/spodnja_kateta)) / 2);
    }
}
