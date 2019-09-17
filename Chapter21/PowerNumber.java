import java.util.Scanner;
public class PowerNumber
{
    public static void main (String[] args)
    {
        Scanner scram = new Scanner(System.in);
        System.out.println("Enter X ");
        double X = scram.nextDouble();

        System.out.println("Enter N ");
        int N = scram.nextInt();

        int count = N;
        int newCount = 1;
        double multiple = X;

        while (newCount < count)
        {
            if (N < 0)
            {
            System.out.println("N must be a positive integer.");
            }
            else
            {
                multiple*= X;
                newCount ++;
            }
        }
        if (N > 0)
        {
            System.out.println(X + " raised to the power of " + N + " is: " + multiple);
        }
    }
}