import java.util.Scanner;
public class SumOddInt
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scan.nextInt();
        int n2 = 0;
        int i = 0;
        for ( i = 1; i < n;  i += 2)
        {
            n2 += i;
        }
        System.out.println("a: " + n2 + "\tb: " + (n*n));
    }
}