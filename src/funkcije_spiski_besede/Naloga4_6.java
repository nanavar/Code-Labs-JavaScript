package funkcije_spiski_besede;

import java.util.Scanner;

//  Faktorial števila
public class Naloga4_6 {

    public static int fakulteta(double n) {
        int produkt = 1;

        for(int i = 1; i <= n; i++) {
            produkt = produkt * i;
        }
        return produkt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi število:");
        double n = scanner.nextDouble();

        System.out.println(fakulteta(n));
    }
}
