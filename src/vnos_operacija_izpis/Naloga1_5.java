package vnos_operacija_izpis;

import java.util.Scanner;
//  Ali je število sodo ter deljivo s 7
public class Naloga1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi število:");
        int st = scanner.nextInt();

        boolean sodoindeljivo = st % 2 == 0 && st % 7 == 0;

        System.out.println(sodoindeljivo);
    }
}
