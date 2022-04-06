package logične_veje_programa;

import java.util.Scanner;
//  Večja številka
public class Naloga2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi prvo številko:");
        int a = scanner.nextInt();

        System.out.println("Vnesi drugo številko:");
        int b = scanner.nextInt();

        System.out.println("Vnesi prvo številko:");
        int c = scanner.nextInt();

        if (a>=b&&a>=c) {
            System.out.println("Največja številka je: " + a);
        }
        else if (b>=a&&b>=c) {
            System.out.println("Največja številka je: " + b);
        }
        else {
            System.out.println("Največja številka je: " + c);
    }
    }
}
