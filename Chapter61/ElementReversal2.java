import java.io.* ;

public class ElementReversal2 {

  public static void main ( String[] args ) {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int[] result = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    // copy the data in reversed order to result
    for ( int j=0; j < data.length; j++) {
        result[j] = data[data.length - 1 - j];
    }
      
    // write out the result
    for ( int j=0; j < result.length; j++) {
        System.out.println(result[j]);
    }

  }
}