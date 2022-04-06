package zanke;

import java.util.Scanner;
//  Najdi najmanjše pozitivno število
public class Naloga3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 0;
        System.out.println("Vnesi število:");
        x = scanner.nextDouble();
        double st_min = x;
        while(true) {
            if(x == 0) {
                break;
            } else if(x < st_min) {
                st_min = x;
            }
            System.out.println("Vnesi število:");
            x = scanner.nextDouble();
        }
        System.out.println("Najmanjše število je: " + st_min);
    }
}
