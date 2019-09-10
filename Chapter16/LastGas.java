import java.util.Scanner;
public class LastGas
{
    public static void main(String[] args)
    {
        int newtank;
        
        Scanner scram = new Scanner(System.in);
        System.out.println("Tank capacity:");
        int tank = scram.nextInt();

        System.out.println("Gage reading:");
        int gauge = scram.nextInt();

        System.out.println("Miles per gallon");
        int mile = scram.nextInt();

        newtank = tank * gauge;

        int possiblemiles = (int)((newtank * mile)/100);

        if (possiblemiles < 200)
        {
            System.out.println("Get Gas!");
        }
        else if (possiblemiles >= 200)
        {
            System.out.println("Safe to Proceed");
        }
        
    }
}
