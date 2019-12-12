public class WeightTester
{
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    int avg1 = june.subAverage(1, 15);
    System.out.println("First half: " + avg1);
    int avg2 = june.subAverage(16, 30);
    System.out.println("Second half: " + avg2);

    System.out.println("The difference is: " + Math.abs(avg1 - avg2));
  }
}