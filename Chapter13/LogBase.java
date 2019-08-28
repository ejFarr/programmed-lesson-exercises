import java.util.Scanner;
public class LogBase
{
    public static void main(String[] args)
    {
        System.out.println("Enter a double: ");
        Scanner scram = new Scanner(System.in);

        double x = scram.nextDouble();
        double base = (Math.log(x) / Math.log(2.0));

        System.out.println("Base 2 log of " + x + " is " + base);

    }
}