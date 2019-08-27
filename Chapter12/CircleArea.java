import java.util.Scanner;
public class CircleArea
{
    public static void main(String[] args)
    {
        System.out.println("Input the radius: ");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double area;
        area = Math.PI * (r * r);
        System.out.println("The radius is: " + r + " The area is: " + area);
    }
}