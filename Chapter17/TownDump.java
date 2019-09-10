import java.util.Scanner;
public class TownDump
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        int weight = scan.nextInt();

        final int initialprice = 20;
        final int additionalprice = 8;
        int finalprice = 0;

        if (weight >= 200)
        {
            finalprice += initialprice;
        }
        if (weight >= 300)
        {
            finalprice += (((weight - 200)/100) * additionalprice);
        }

        System.out.println("The price to take your trash is: " + finalprice);

    }
}