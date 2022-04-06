package funkcije_spiski_besede;

import java.util.Scanner;
//  Število znakov
public class Naloga4_4 {
    public static int stevilo_znakov(String besedilo) {
        int stevec = 0;
        for (int i = 0; i < besedilo.length(); i++) {
            char crka = besedilo.charAt(i);
            if ((crka >= '!' && crka <= '/')) {
                stevec++;
            }
        }
        return stevec;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi besedilo:");
        String a =scanner.nextLine();

        int b = stevilo_znakov(a);

        System.out.println("Število znakov: " + b);
    }
}

