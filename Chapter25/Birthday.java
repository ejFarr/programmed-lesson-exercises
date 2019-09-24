import java.util.Scanner;
public class Birthday
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of people: ");
        int n = scan.nextInt();
        double probability = 100;
        boolean past50 = false;

        for (int i = 1; i <= n; i++)
        {
            probability *= ((365 - i) / 365.0);

            if (probability <= 50.0 && past50 == false)
            {
                System.out.println("You need " + i + " guests to have more than a 50% chance.");
                past50 = true;
            }
        }
        System.out.println("Your final probability is: " + probability);
    }
}