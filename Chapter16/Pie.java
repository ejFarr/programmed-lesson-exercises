import java.util.Scanner;
public class Pie
{
    public static void main (String[] args)
    {
        Scanner scram = new Scanner(System.in);
        System.out.println("Enter your weight:");
        int w = scram.nextInt();

        if (w > 220 && w < 280)
        {
            System.out.println("Weight is within limits");
        }
        else
        {
            System.out.println("Out of weight limits");
        }
    }
}