import java.util.Scanner;
public class Discount
{
    public static void main(String[] args) 
    {
        int Discount;
        System.out.println("Enter the amount of purchases: ");
        Scanner scram = new Scanner(System.in);
        int purchase = scram.nextInt();

        if (purchase > 1000)
        {
            Discount = (int)(purchase * 0.9);
        }
        else
        {
            Discount = purchase;
        }
        System.out.println("Discounted price: " + Discount);
    }
}