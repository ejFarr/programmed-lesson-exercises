import java.util.Scanner;
public class HarmonicSum
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int N = scan.nextInt();

        double sum = 0;
        int count = 1;

        while (count <= N)
        {
            sum += 1.0/count;
            count ++;
        }
        System.out.println("Sum is: " + sum);
    }
}