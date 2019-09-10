import java.util.Scanner;
public class Internet
{
    public static void main (String[] args)
    {
        Scanner scram = new Scanner(System.in);
        System.out.println("Enter the item: ");
        String item = scram.nextLine();

        System.out.println("Enter the price: ");
        double price = scram.nextDouble();

        System.out.println("Overnight delivery (0==no, 1==yes): ");
        int night = scram.nextInt();

        double deliv = 0.00;
        double finale;

        if (price < 10.00)
        {
            deliv = 2.00;
        }
        if (night == 1)
        {
            deliv += 3.00;
        }
        finale = price + deliv;

        System.out.println("Invoice: ");
        System.out.println(     item + " " + price);
        System.out.println(     "delivery " + deliv);
        System.out.println(     "total " + finale);

    }
}