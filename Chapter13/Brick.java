import java.util.Scanner;
public class Brick
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of seconds: ");
        Scanner scram = new Scanner(System.in);

        
        double t = scram.nextDouble();
        double g = 32.174;

        double d = (1.0/2) * (g * (t * t));
        System.out.println("Distance: " + d);
    }
}