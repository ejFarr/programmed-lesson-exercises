import java.util.Arrays;

public class Weight {
  private int[] data;
  
  // Constructor
  public Weight(int[] init) {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j < data.length; j++)
    {
      data[j] = init[j];
    }
  }

  public int average() {
      int average = 0;
      for (int i = 0; i < data.length; i++) {
          average += data[i];
      }
      return average / data.length;
  }
  
  //Print
  public String toString() {
    return Arrays.toString(data);
  }
}
