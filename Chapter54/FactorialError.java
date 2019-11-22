import java.util.*;

public class FactorialError {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        long fact = 0; 
        int n;

        System.out.println( "To exit, enter a negative value" );
        System.out.print( "Enter N: " );
        n = scan.nextInt();

        while ( factorial(n) <= 0 )
        {
        fact = factorial( n );
        System.out.println( "factorial is " + fact );
        System.out.print( "Enter N: " );
        n = scan.nextInt();
        }
        fact = factorial(n);
        System.out.println(fact);
    }
    public static long factorial( int num )
    {
        if (num < 0) {
            return -1;
        } else if (num > 20) {
            return -1;
        }
        long fct = 1;
        for ( int j=1; j<=num; j++ )
        fct *= j;
        return fct;
    }
}