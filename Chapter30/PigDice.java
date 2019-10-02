import java.util.*;
public class PigDice
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        for (int computer = 0, score = 0; computer < 100 || score < 100; )
        {
            computer += (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
            
        }
    }
}