package logične_veje_programa;

import java.util.Scanner;
//  Manjša številka
public class Naloga2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi prvo številko:");
        int x = scanner.nextInt();

        System.out.println("Vnesi drugo številko:");
        int y = scanner.nextInt();

        if (x < y) {
            System.out.println("Manjše je: " + x);
        }
        else {
            System.out.println("Manjša je: " + y);
        }
    }
}
