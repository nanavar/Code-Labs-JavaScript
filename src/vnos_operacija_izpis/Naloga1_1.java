package vnos_operacija_izpis;

import java.util.Scanner;
//  Pozdravi uporabnika
public class Naloga1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi ime: ");
        String ime = scanner.next();

        String pozdrav = "Pozdravljen/a " + ime + "!";

        System.out.println(pozdrav);
    }
}

