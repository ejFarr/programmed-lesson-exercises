import java.util.*;
public class Guessing
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int number = rand.nextInt(10) + 1;
        System.out.println("I am thinkning of a number from 1 to 10. You must guess what it is in three tries.");
        System.out.println("Enter a guess: ");
        int guess = scan.nextInt();

        if (guess == number)
        {
            System.out.println("Right");
        }
        else
        {
            System.out.println("Wrong.");
        }
    }
}