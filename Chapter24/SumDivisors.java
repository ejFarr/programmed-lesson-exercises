 import java.util.Scanner;
 public class SumDivisors
 {
     public static void main (String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scan.nextInt();
        int i = 0;
        int sum = 0;
        for (i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        System.out.println("The sum of the divisors is: " + sum);
        if (sum == n)
        {
            System.out.println("N is a perfect number.");
        }
     }
 }