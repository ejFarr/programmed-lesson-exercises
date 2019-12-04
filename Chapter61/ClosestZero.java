import java.io.* ;

public class ClosestZero {

  public static void main ( String[] args ) {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    int n = data[0];
    
    // find the element nearest to zero
    for (int index = 0; index < data.length; index++) {
        if (Math.abs(data[index]) < n) {
            n = data[index];
        }
    }
      
    // write out the element nearest to zero
    System.out.println("The closest to zero is: " + n);

  }
}