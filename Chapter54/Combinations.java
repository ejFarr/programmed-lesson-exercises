import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int n = scan.nextInt();

        System.out.println("Enter R");
        int r = scan.nextInt();

        while ( factorial(n) <= 0 )
        {
        System.out.print( "Enter N: " );
        n = scan.nextInt();
        }

        long combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("The combination is: " + combination);
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