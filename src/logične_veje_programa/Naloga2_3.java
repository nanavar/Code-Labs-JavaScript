package logične_veje_programa;

import java.util.Scanner;
//  Dan tedna
public class Naloga2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi dan:");
        int t = scanner.nextInt();
        if (t == 1) {
            System.out.println("Ponedeljek");
        } else if (t == 2) {
            System.out.println("Torek");
        } else if (t == 3) {
            System.out.println("Sreda");
        } else if (t == 4){
            System.out.println("Četrtek");
        } else if (t == 5) {
            System.out.println("Petek");
        } else if (t == 6) {
            System.out.println("Sobota");
        } else if (t == 7) {
            System.out.println("Nedelja");
        }
    }
}
