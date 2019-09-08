import java.util.Scanner;
public class OrderCheck
{
    public static void main(String[] args)
    {
        Scanner scram = new Scanner(System.in);
        int bolt;
        int nut;
        int wash;
        boolean n;
        boolean w;
        int cost;
        System.out.println("Number of bolts: ");
        bolt = scram.nextInt();
        System.out.println("Number of nuts: ");
        nut = scram.nextInt();
        System.out.println("Number of washers: ");
        wash = scram.nextInt();

        cost = (bolt * 5) + (nut * 3) + (wash * 1);
        if(nut >= bolt)
        {
            n = true;
        }
        else
        {
            n = false;
        }
        if (wash >= (2 * bolt))
        {
            w = true;
        }
        else
        {
            w = false;
        }
        if (n == false)
        {
            System.out.println("Check the order: too few nuts");
        }
        
        if (w == false)
        {
            System.out.println("Check the order: too few washers");
        }
        if (n && w)
        {
            System.out.println("Order is Ok");
        }

        System.out.println("Total cost: " + cost);
    }
}