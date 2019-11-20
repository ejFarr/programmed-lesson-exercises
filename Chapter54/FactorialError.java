import java.util.*;
public class FactoialError {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        long fact; 
        int N;

        System.out.println( "To exit, enter a negative value" );
        System.out.print( "Enter N: " );
        N = scan.nextInt();

        while ( N <= 0 )
        {
        fact = factorial( N );
        System.out.println( "factorial is " + fact );
        System.out.print( "Enter N: " );
        N = scan.nextInt();
        }
    }
    public static long factorial( int num )
    {
        if (num < 0) {
            return -1;
        } else if (num > 20) {
            return -1;
        }
        return 1L;
    }
}