import java.util.*;
public class Password
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a secret password: ");
        String password = scan.nextLine();
        int i = 0;
        String newPassword = "";
        for (i = 0; newPassword != password; i++)
        {
            newPassword = "";
            for (int j = 0; j < password.length(); j++)
            {
                int letter = rand.nextInt(26) + 97;
                char newLetter = (char) letter;
                newPassword += newLetter;
                
            }
            
        }
        System.out.println("Here is your password: " + password);
        System.out.println("It took " + i + " tries to guess it");
    }
}