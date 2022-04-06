package zanke;

import java.util.Scanner;
//  Preštej število pozitivnih števil
public class Naloga3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stevec = 0;

        while(true) {
            System.out.println("Vnesi število:");
            int st = scanner.nextInt();
            if (st > 0) {
                stevec ++;
            }
            if (st == 0) {
                break;
            }
        }
        System.out.println("Število pozitivnih: " + stevec);
    }
}
