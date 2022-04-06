package zanke;

import java.util.Scanner;
//  Nariši polovični trikotnik
public class Naloga3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi število:");
        int st = scanner.nextInt();
        int st_vrst = 1;
        for (int y = 0; y < st; y++) {
            for (int x = 0; x < st_vrst; x++) {
                System.out.print("*");
            }
            st_vrst++;
            System.out.println();
        }
    }
}
