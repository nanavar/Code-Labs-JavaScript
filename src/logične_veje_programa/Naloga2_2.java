package logične_veje_programa;

import java.util.Scanner;
//  Predznak števila
public class Naloga2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi prvo številko:");
        int x = scanner.nextInt();

        if (x < 0) {
            System.out.println("Številka ima predznak: -");
        }
        else if (x > 0) {
            System.out.println("Številka ima predznak: +");
        }
        else {
            System.out.println("Številka nima predznaka");
        }
    }
}
