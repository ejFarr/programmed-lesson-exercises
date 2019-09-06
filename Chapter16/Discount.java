import java.util.Scanner;
public class Discount
{
    public static void main(String[] args) 
    {
        int D;
        System.out.println("Enter the amount of purchases: ");
        Scanner scram = new Scanner(System.in);
        int P = scram.nextInt();

        if (P > 1000)
        {
            D = (int)(P * 0.9);
        }
        else
        {
            D = P;
        }
        System.out.println("Discounted price: " + D);
    }
}