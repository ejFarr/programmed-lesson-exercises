import java.util.Scanner;
public class SumInt
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scan.nextInt();

        int value = 1;
        int total = 0;
        int loopSum = 0;
        int formulaSum = (N*(N+1))/2;

        while (value <= N)
        {
            total += value;
            value ++;
            loopSum = total;
        }


        System.out.println("Loop sum = " + loopSum);
        System.out.println("Formula sum = " + formulaSum);
    }
}