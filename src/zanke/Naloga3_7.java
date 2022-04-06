package zanke;

import java.util.Scanner;
//  Nariši kvadrat zvezdic
public class Naloga3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi število:");
        int st = scanner.nextInt();
        for (int y = 0; y < st;  y++) {
            for (int x = 0; x < st; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
