package funkcije_spiski_besede;

import java.util.Scanner;
//  Število besed
public class Naloga4_1 {
    public static int prestej_besede(String besedilo) {
        int stevec = 0;
        for (int i = 0; i < besedilo.length(); i++) {
            char crka = besedilo.charAt(i);
            if (crka == ' ') {
                stevec++;
            }
        }
        return stevec+1;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi besedilo:");
        String a =scanner.nextLine();

        int b = prestej_besede(a);

        System.out.println("Število besed: " + b);
    }
}

