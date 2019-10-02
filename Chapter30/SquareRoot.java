import java.util.*;
public class SquareRoot
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Rounds?");
        int rounds = scan.nextInt();

        System.out.println("First player, sign in: ");
        String first = scan.next();

        System.out.println("Second player, sign in: ");
        String second = scan.next();
        int score1 = 0;
        int score2 = 0;


        for (int i = 1; i <= rounds; i ++)
        {
            double quiz = 100 * rand.nextDouble() + 1.0;
            if (i % 2 == 0)
            {
                System.out.println("What is the square root of " + quiz);
                System.out.println(first + ", your guess: ");
                double answer1 = scan.nextDouble();

                System.out.println(second + ", your guess: ");
                double answer2 = scan.nextDouble();

                double root = Math.sqrt(quiz);
                System.out.println("The correct square root: " + root);
                answer1 = Math.abs(answer1 - root);
                answer2 = Math.abs(answer2 - root);

                System.out.println(first + " is " + answer1 + " away");
                System.out.println(second + " is " + answer2 + " away");
                if (answer1 < answer2)
                {
                    System.out.println(first + " wins!");
                    score1 ++;
                }
                else
                {
                    System.out.println(second + " wins!");
                    score2 ++;
                }
            }
            else
            {
                System.out.println("What is the square root of " + quiz);
                System.out.println(second + ", your guess: ");
                double answer2 = scan.nextDouble();

                System.out.println(first + ", your guess: ");
                double answer1 = scan.nextDouble();

                double root = Math.sqrt(quiz);
                System.out.println("The correct square root: " + root);
                answer1 = Math.abs(answer1 - root);
                answer2 = Math.abs(answer2 - root);

                System.out.println(first + " is " + answer1 + " away");
                System.out.println(second + " is " + answer2 + " away");
                if (answer1 < answer2)
                {
                    System.out.println(first + " wins!");
                    score1 ++;
                }
                else
                {
                    System.out.println(second + " wins!");
                    score2 ++;
                }
            }
        }
        System.out.println("---- Final Score ----");
        System.out.println(first + " " + score1 + "\t" + second + " " + score2);
    }
}