import java.util.Scanner;
public class OrderCheck
{
    public static void main(String[] args)
    {
        Scanner scram = new Scanner(System.in);
        int bolt;
        int nut;
        int wash;
        boolean nutsright;
        boolean washersright;
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
            nutsright = true;
        }
        else
        {
            nutsright = false;
        }
        if (wash >= (2 * bolt))
        {
            washersright = true;
        }
        else
        {
            washersright = false;
        }
        if (nutsright == false)
        {
            System.out.println("Check the order: too few nuts");
        }
        
        if (washersright == false)
        {
            System.out.println("Check the order: too few washers");
        }
        if (nutsright && washersright)
        {
            System.out.println("Order is Ok");
        }

        System.out.println("Total cost: " + cost);
    }
}