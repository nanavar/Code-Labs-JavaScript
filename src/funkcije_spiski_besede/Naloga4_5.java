package funkcije_spiski_besede;

import java.util.Scanner;

//  Vsota besed, povdedi, črk, znakov
public class Naloga4_5 {

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

    public static int stevilo_povedi(String besedilo) {
        int stevec = 0;
        for (int i = 0; i < besedilo.length(); i++) {
            char crka = besedilo.charAt(i);
            if (crka == '.' || crka == '!' || crka == '?') {
                stevec++;
            }
        }
        return stevec;
    }

    public static int stevilo_crk(String besedilo) {
        int stevec = 0;
        for (int i = 0; i < besedilo.length(); i++) {
            char crka = besedilo.charAt(i);
            if ((crka >= 'A' && crka <= 'Z') || (crka >= 'a' && crka <= 'z')) {
                stevec ++;
            }
        }
        return stevec;
    }

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

        int vsota = prestej_besede(a) + stevilo_povedi(a) + stevilo_crk(a) + stevilo_znakov(a);

        System.out.println("Vsota: " + vsota);
    }
}

