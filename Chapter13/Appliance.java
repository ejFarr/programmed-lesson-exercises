import java.util.Scanner;
public class Appliance
{
    public static void main(String[] args)
    {
        System.out.println("Enter cost per kilowatt-hour in cents");
        Scanner scim = new Scanner(System.in);

        System.out.println("Enter kilowatt-hours used per year");
        Scanner scram = new Scanner(System.in);

        double cost = (scim.nextDouble() * scram.nextDouble()) / 100;
        System.out.println("Annual cost: " + cost);

    }
}