import java.util.Scanner;
public class Odious {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        while (number >= 0) {
            System.out.println("Please enter a nonnegative number.");
            number = scan.nextInt();
            if (number < 0) {
                break;
            }
            if (odious(number) >= 0) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
    private static long odious(int number) {
        int n = number;
        long binary = 0;
        while (n != 0) {
            binary += n % 2;
            n /= 2;
        }
        if (binary % 2 == 1) {

            return 0;
        }
        return -1;
    }
}