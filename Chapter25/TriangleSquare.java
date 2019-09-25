import java.util.Scanner;
public class TriangleSquare
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert limit: ");
        int limit = scan.nextInt();
        int sum = 0;
        int square = 0;

        for (int i = 1; i <= limit; i++)
        {
            
            square = i * i;

            for (int j = 1; j <= limit; j++)
            {
                sum = (j * j + j) / 2;
                if (sum == square)
            {
                System.out.println(square + " is both a square and triangle number.");
            }
            }
            
        }
    }
}
