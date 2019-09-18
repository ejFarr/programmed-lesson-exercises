import java.util.Scanner;
public class CheckCharge
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter checking balance: ");
        int checking = scan.nextInt();

        System.out.println("Enter the savings balance: ");
        int savings = scan.nextInt();

        if (savings >= 1500 || checking >= 1000)
        {
            System.out.println("There is no service charge.");
        }
        else
        {
            System.out.println("Your service charge is $0.15.");
        }
    }
}