public class Dollars
{
    public static void main(String[] args)
    {
        int c = 324;
        int dolla;
        int rem;

        dolla = c / 100;
        rem = c % 100;
        System.out.println("That is " + dolla + " dollars and " + rem + " cents.");
    }
}