public class Change
{
    public static void main(String[] args)
    {
        int change = 163;
        int d;
        int q;
        int di;
        int c;
        d = change / 100;
        q = (change % 100) / 25;
        di = ((change % 100) % 25) / 10;
        c = (((change % 100) % 25) % 10);
        System.out.println("Your change is: " + d + " dollar, " + q + " quarters, " + di + " dime, and " + c + " cents.");
    }
}