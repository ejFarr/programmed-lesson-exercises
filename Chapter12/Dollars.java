import java.util.Scanner;
public class Dollars
{
    public static void main(String[] args)
    {
        System.out.println("Input the cents: ");
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int dolla;
        int rem;

        dolla = c / 100;
        rem = c % 100;
        System.out.println("That is " + dolla + " dollars and " + rem + " cents.");
    }
}