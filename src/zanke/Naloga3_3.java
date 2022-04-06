import java.util.Scanner;
//  Vsota poljubnih števil
public class Naloga3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vsota = 0;
        int pozitivno = 0;
        int negativno = 0;

        while(true) {
            System.out.println("Vnesi število:");
            int st = scanner.nextInt();
            if (st > 0) {
                pozitivno ++;
            }
            else if (st < 0) {
                negativno ++;
            }
            else if (st == 0) {
                break;
            }
            vsota = pozitivno + negativno;
        }
        System.out.println("Število pozitivnih: " + vsota);
    }
}
