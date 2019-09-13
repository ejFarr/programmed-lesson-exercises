import java.util.Scanner;
public class Run
{
    public static void main (String[] args)
    {
        Scanner scram = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = scram.nextInt();

        System.out.println("Enter end: ");
        int end = scram.nextInt();

        int count = start;

        while (count <= end)
        {
            System.out.println(count);
            count++;
        }
        
    }
}