import java.util.Scanner;
//  Povprečje poljubnih števil
public class Naloga3_4 {
    public static void main(String[] args) {
        //  NI ŠE DOKONČANA
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vpiši številko:");
        double st = scanner.nextDouble();

        double vsota = 0;
        double stevec = 0;
        double povprecje = vsota / stevec;

        if (st < 0 || st > 0) {
            stevec ++;
            vsota += st;
        }
        else if  (st == 0) {
            break;
        }


        System.out.println("Povprečje števil je: %.2%n" + povprecje);
    }
}
