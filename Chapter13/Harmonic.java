import java.util.Scanner;
public class Harmonic
{
    public static void main (String[] args)
    {
        System.out.println("Enter X:");

        Scanner scram = new Scanner(System.in);
        double x = scram.nextDouble();

        System.out.println("Enter Y:");

        Scanner kyle = new Scanner(System.in);
        double y = kyle.nextDouble();

        double h = 2 / (1/x + 1/y);
        double a = (x + y) / 2;

        System.out.println("Arithmetic mean: " + a);
        System.out.println("Harmonic mean: " + h);

    }
}