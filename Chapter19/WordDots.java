import java.util.Scanner;
public class WordDots
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String first = scan.nextLine();

        System.out.println("Enter second word:");
        String second = scan.nextLine();

        String dotString = ".";
        String newString = first + dotString + second;

        while (newString.length() < 30)
        {
            dotString += ".";
            newString = first + dotString + second;
        }
        System.out.println(newString);
    }
}