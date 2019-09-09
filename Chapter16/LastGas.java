import java.util.Scanner;
public class LastGas
{
    public static void main(String[] args)
    {
        int nu;
        
        Scanner scram = new Scanner(System.in);
        System.out.println("Tank capacity:");
        int tank = scram.nextInt();

        System.out.println("Gage reading:");
        int gage = scram.nextInt();

        System.out.println("Miles per gallon");
        int mile = scram.nextInt();

        nu = tank * gage;

        int stu = (int)((nu * mile)/100);

        if (stu < 200)
        {
            System.out.println("Get Gas!");
        }
        else if (stu >= 200)
        {
            System.out.println("Safe to Proceed");
        }
        
    }
}
