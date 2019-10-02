import java.util.*;
public class RandomWalk
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        double x = 0.0;
        double y = 0.0;
        double distance = 0.0;
        System.out.println("Enter amount of movements: ");
        int increment = scan.nextInt();
        for (int i = 0; i < increment; i ++)
        {
            x += 2 * rand.nextDouble() - 1.0;
            y += 2 * rand.nextDouble() - 1.0;
            System.out.println("X: " + x + "\tY: " + y);
        }
        distance = Math.sqrt((x * x) + (y * y));
        System.out.println("X: " + x + "\tY: " + y + "\tDistance: " + distance);
    }
}