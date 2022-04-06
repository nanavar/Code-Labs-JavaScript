package vnos_operacija_izpis;

import java.util.Scanner;
//  Število sekund
public class Naloga1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi uro:");
        int ura = scanner.nextInt();

        System.out.println("Vnesi minute:");
        int minute = scanner.nextInt();

        System.out.println("Vnesi sekunde:");
        int sekunde = scanner.nextInt();

        double st_sek = ura*60*60 + minute*60 + sekunde;

        System.out.println("Število sekund je: " + st_sek);
    }
}
