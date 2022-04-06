import java.util.Scanner;
//  Ugani skrito število
public class Naloga3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        boolean correct = false;

        System.out.println("Vpiši skrito število:");
        int secret = scanner.nextInt();

        while (!correct) {
            System.out.println("Vpiši število:");
            guess = scanner.nextInt();
            if (guess == secret) {
                correct = true;
                System.out.println("Uganil si!");
            } else if (guess < secret) {
                System.out.println("Probaj večje število...");
            } else if (guess > secret) {
                System.out.println("Probaj manjše število...");
            }
        }
    }
}


