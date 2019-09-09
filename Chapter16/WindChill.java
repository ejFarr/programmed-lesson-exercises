import java.util.Scanner;
public class WindChill
{
    public static void main (String[] args)
    {
        Scanner scram = new Scanner(System.in);
        System.out.println("Enter Wind Speed:");
        double wind = scram.nextInt();

        System.out.println("Enter Temperature:");
        double temp = scram.nextInt();

        double chill;

        if (wind < 3)
        {
            chill = temp;
        }
        else if (temp > 50)
        {
            chill = temp;
        }
        else
        {
            chill = (35.74 + (0.6215 * temp - (35.75 * Math.pow(wind, 0.16)) + (0.4275 * temp * Math.pow(wind, 0.16))));
        }
        System.out.println(chill);
    }
}