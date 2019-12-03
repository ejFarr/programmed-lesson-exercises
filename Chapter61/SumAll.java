import java.io.*;

public class SumAll {

  public static void main ( String[] args ) {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    int evenSum = 0;
    int oddSum = 0;
    int allSum = 0;
    
    // compute the sums
    for ( int index=0; index < data.length; index++) {
        if (data[index] % 2 > 0) {
            oddSum += data[index];
        }
        else {
            evenSum += data[index];
        }
        allSum += data[index];
    }
      
    // write out the three sums
    System.out.println("Even sum: " + evenSum + " Odd sum: " + oddSum + " All sum: " + allSum);

  }
}