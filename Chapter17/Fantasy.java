import java.util.Scanner;
public class Fantasy
{
    public static void main (String[] args)
    {
        Scanner scram = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest");

        System.out.println("Enter your name: ");
        String nami = scram.nextLine();

        System.out.println("Enter STRENGTH (1-10): ");
        int str = scram.nextInt();

        System.out.println("Enter HEALTH (1-10): ");
        int hel = scram.nextInt();

        System.out.println("Enter LUCK (1-10): ");
        int lck = scram.nextInt();

        if (hel + lck + str > 15)
        {
            System.out.println("You have given too many points! Default values have been assigned: ");
            System.out.println(nami + ", strength: 5, health: 5, luck: 5");
        }
        if (hel + lck + str <= 15)
        {
            System.out.println("Welcome to Yertle's Quest! Your character is: ");
            System.out.println(nami + ", Strength: " + str + ", Health: " + hel + ", Luck: " + lck);
        }

    }
}