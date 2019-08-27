import java.util.Scanner;
public class ohm
{
    public static void main(String[] args)
    {
        System.out.println("Input the voltage: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the resistance: ");
        Scanner slam = new Scanner(System.in);
        int v = scan.nextInt();
        int r = slam.nextInt();
        double i;
        i = (v + 0.0) / r;
        System.out.println(i);
    }
}