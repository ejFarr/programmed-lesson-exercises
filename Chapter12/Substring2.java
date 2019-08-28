import java.util.Scanner;
public class Substring2
{
    public static void main(String[] arg)
    {
        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter beginning index: ");
        Scanner slim = new Scanner(System.in);
        System.out.println("Enter ending index: ");
        Scanner slam = new Scanner(System.in);
        String originalString = scan.nextLine();
        String newString = originalString.substring(slim.nextInt(), slam.nextInt());
        System.out.println("Original string: ");
        System.out.println(originalString);
        System.out.println("Substring: ");
        System.out.println(newString);
    }
}