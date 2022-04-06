package funkcije_spiski_besede;

import java.util.Scanner;
//  Število črk
public class Naloga4_3 {
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
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi besedilo:");
        String a =scanner.nextLine();

        System.out.println(stevilo_crk(a));
    }
}
