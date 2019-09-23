public class SheepHerd
{
    public static void main (String[] args)
    {
        int n = 20;
        int t = 0;
        double power = 1;
        for (t = 0; t <= 25; t++)
        {
            power *= 0.83;
            n = (int)(220.0 / (1 + 10 * power));
            System.out.println("Sheep: " + n + "\tYear: " + t);
        }
        
    }
}