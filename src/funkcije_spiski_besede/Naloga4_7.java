package funkcije_spiski_besede;

import java.util.Scanner;

//  Izračunaj sinus
public class Naloga4_7 {

public static int fakulteta(double n) {
        int produkt = 1;

        for(int i = 1; i <= n; i++) {
        produkt = produkt * i;
        }
        return produkt;
        }

    public static double sinus(double n) {
        double vsota = 0;
        int st = 1;

        for (int i = 1; i <= 7; i++) {

            if (i % 2 == 0) {
                vsota = (Math.pow(n, st) / fakulteta(st));
            } else {
                vsota = (Math.pow(n, st) / fakulteta(st));
            }
            st += 2;
        }
        return vsota;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi število:");
        double n = scanner.nextDouble();

        System.out.println("Sinus: " + sinus(n));
    }
}