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
        int strength = scram.nextInt();

        System.out.println("Enter HEALTH (1-10): ");
        int health = scram.nextInt();

        System.out.println("Enter LUCK (1-10): ");
        int luck = scram.nextInt();
        while (strength > 10 || strength < 1)
        {
            System.out.println("Enter STRENGTH (1-10): ");
            strength = scram.nextInt();
        }
        while (health > 10 || health < 1)
        {
            System.out.println("Enter HEALTH (1-10): ");
            health = scram.nextInt();
        }
        while (luck > 10 || luck < 1)
        {
            System.out.println("Enter LUCK (1-10): ");
            luck = scram.nextInt();
        }
        if (health + luck + strength > 15)
        {
            System.out.println("You have given too many points! Default values have been assigned: ");
            System.out.println(nami + ", strength: 5, health: 5, luck: 5");
        }
        if (health + luck + strength <= 15)
        {
            System.out.println("Welcome to Yertle's Quest! Your character is: ");
            System.out.println(nami + ", Strength: " + strength + ", Health: " + health + ", Luck: " + luck);
        }

    }
}