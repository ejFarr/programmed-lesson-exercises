import java.util.Scanner;
public class Factorial
{
    public static int factorial(int num){    
        if (num == 0)    
          return 1;    
        else    
          return(num * factorial(num-1));    
       }  
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X: ");
        double termX = scan.nextDouble();
        int n = 1;
        double sumE = 0;
        double sumReal = Math.exp(termX);

        while (termX > 0.000000000001)
        {
            termX = Math.pow(termX, n)/ factorial(n);
            sumE += termX;
            System.out.println("n: " + n + "\tTerm: " + termX + "\tSum: " + sumE);
            n ++;
        }
        System.out.println("My answer: " + sumE);
        System.out.println("Real answer: " + sumReal);
    }
}