import java.util.Scanner;
public class AddInt
{
    public static void main (String[] args)
    {
        Scanner scram = new Scanner(System.in);
        System.out.println("How many integers will be added");
        int amount = scram.nextInt();

        int count = 0;
        int sum = 0;
        while (count < amount)
        {
        System.out.println("Enter an integer");
        int integer = scram.nextInt();
        sum += integer;
        count ++;
        }

        System.out.println("The sum is " + sum);
        
    }
}