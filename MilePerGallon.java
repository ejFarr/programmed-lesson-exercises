import java.util.Scanner;
public class MilePerGallon
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int initialMiles = 0;
        int finalMiles = 0;
        int gallons = 0;
        double milesPer = 0;

        while (initialMiles >= 0)
        {
            System.out.println("Initial miles (negative to quit): ");
            initialMiles = scan.nextInt();

            if (initialMiles < 0)
            {
                System.out.println("bye");
                break;
            }

            System.out.println("Final miles: ");
            finalMiles = scan.nextInt();

            System.out.println("Gallons: ");
            gallons = scan.nextInt();

            milesPer = (finalMiles - initialMiles) / gallons;
            System.out.println("Miles per Gallon: " + milesPer);
        }

        
    }
}