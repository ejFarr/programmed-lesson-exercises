import java.io.*;

public class TwoElements
{

  public static void main ( String[] args )  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables for the two largest
    int large1 = data[0];
    int large2 = 0;
    
    // compute the two largest
    for ( int index = 0; index < data.length; index++) {
        if (data[index] > large1) {
          large2 = large1;
          large1 = data[index];
        }
        if (data[index] < large1 && data[index] > large2) {
          large2 = data[index];
        }
    }
      
    // write out the two largest
    System.out.println("The two largest are: "  + large1 + " " + large2);

  }
}