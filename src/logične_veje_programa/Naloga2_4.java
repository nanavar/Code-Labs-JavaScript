package logične_veje_programa;

import java.util.Scanner;
//  Točka in krog
public class Naloga2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesite x točke:");
        double xt = scanner.nextDouble();
        System.out.println("Vnesite y točke:");
        double yt = scanner.nextDouble();

        System.out.println("Vnesite radij kroga:");
        double r = scanner.nextDouble();

        System.out.println("Vnesite x središča:");
        double xs = scanner.nextDouble();
        System.out.println("Vnesite y središča:");
        double ys = scanner.nextDouble();

        double razdalja = Math.sqrt(
                Math.pow(xs-xt,2) + Math.pow(ys-yt,2)
        );

        if (r > razdalja) {
            System.out.println("Točka se nahaja v krogu!");
        }
        else {
            System.out.println("Točka se ne nahaja v krogu.");
        }

    }
}
