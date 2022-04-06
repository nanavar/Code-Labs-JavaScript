package zanke;

import java.util.Scanner;
//  Vsota števil do 100
public class Naloga3_1 {
    public static void main(String[] args) {

        int vsota = 0;
        for (int i = 0; i <= 100; i++) {
            vsota = vsota + i;
        }
        System.out.println("Vsota je: " + vsota);
    }
}
