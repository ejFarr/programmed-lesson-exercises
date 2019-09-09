import java.util.Scanner;
public class YourAge
{
    public static void main (String[] args)
    {
        
        Scanner scram = new Scanner(System.in);
        System.out.println("Enter years:");
        int year = scram.nextInt();

        System.out.println("Enter months:");
        int month = scram.nextInt();

        System.out.println("Enter days:");
        int day = scram.nextInt();

        int mday = 0;

        if (month == 1)
        {
            mday = 31;
        }
        else if (month == 2)
        {
            mday = 31 + 28;
        }
        else if (month == 3)
        {
            mday = 31 + 28 + 31;
        }
        else if (month == 4)
        {
            mday = 31 + 28 + 31 + 30;
        }
        else if (month == 5)
        {
            mday = 31 + 28 + 31 + 30 + 31;
        }
        else if (month == 6)
        {
            mday = 31 + 28 + 31 + 30 + 31 + 30;
        }
        else if (month == 7)
        {
            mday = 31 + 28 + 31 + 30 + 31 + 30 + 31;
        }
        else if (month == 8)
        {
            mday = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        }
        else if (month == 9)
        {
            mday = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        }
        else if (month == 10)
        {
            mday = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        }
        else if (month == 11)
        {
            mday = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        }

        day += ((year * 365) + mday);

        int hour = day * 24;

        int minute = hour * 60;

        int second = minute * 60;

        System.out.println("Your age in seconds is: " + second);

    }
}