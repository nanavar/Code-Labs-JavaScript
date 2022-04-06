package vnos_operacija_izpis;

import java.util.Scanner;
//  Ali se število NE nahaja v območju
public class Naloga1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi min:");
        double min = scanner.nextDouble();

        System.out.println("Vnesi max:");
        double max = scanner.nextDouble();

        System.out.println("Vnesi število:");
        double st = scanner.nextDouble();

        boolean  test = min >= st && max <= st;

        boolean test2 = !(min <= st && max >= st); //negacija

        System.out.println(test);
    }
}
