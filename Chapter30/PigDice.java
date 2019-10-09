import java.util.*;
public class PigDice
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String rollString = "";
        int roll = 0;
        int sum = 0;
        boolean computerWin = false;
        boolean playerWin = false;
        for (int computer = 0, score = 0; computer < 100 && score < 100; )
        {
            sum = 0;
            rollString = "";
            computer += (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
            System.out.println("Computer score: " + computer);
            System.out.println("Your score: " + score);
            while (!rollString.equals("stop") || roll == 1)
            {
                System.out.println("Will you roll?(stop for no)");
                rollString = scan.next();

                roll = rand.nextInt(6) + 1;
                System.out.println("You rolled: " + roll);
                if (roll > 1)
                {
                    sum += roll;
                    System.out.println("Working sum: " + sum);
                }
                else
                {
                    break;
                }
            }
            if (rollString.equals("stop"))
            {
                score += sum;
            }
            if (computer >= 100)
            {
                computerWin = true;
            }
            else if (score >= 100)
            {
                playerWin = true;
            }
        }
        if (playerWin)
        {
            System.out.println("Player wins.");
        }
        else
        {
            System.out.println("Computer wins.");
        }
    }
}