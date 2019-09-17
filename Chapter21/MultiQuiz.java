import java.util.Scanner;
import java.util.Random;
public class MultiQuiz
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random scram = new Random();
        int count = 10;
        int answered = 0;
        int num1 = 0;
        int num2 = 0;
        int answer = 0;
        int right = 0;

        while (answered < count)
        {
            answered ++;
            num2 = scram.nextInt(9);
            num1 = scram.nextInt(9);

            System.out.println("What is " + num1 + " * " + num2);
            answer = scan.nextInt();

            if (answer == (num1 * num2))
            {
                System.out.println("Right!");
                right ++;
            }
            else
            {
                System.out.println("Wrong.");
            }
        }
        System.out.println("you got " + right + " out of 10 questions correct!");
    }
}