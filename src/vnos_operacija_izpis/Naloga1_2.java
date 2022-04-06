package vnos_operacija_izpis;

import java.util.Scanner;
//  Ali je število pozitivno
public class Naloga1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi število: ");
        double st = scanner.nextDouble();

        boolean pozitivna_st = st > 0; //true

        System.out.println(pozitivna_st);
    }
}
