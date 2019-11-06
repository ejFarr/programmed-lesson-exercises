public class Pantry {
    // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  public Pantry( Jam jar1, Jam jar2, Jam jar3 ) {
    this.jar1 = jar1;
    this.jar2 = jar2;
    this.jar3 = jar3;
    selected = null;
  }

  public Pantry (Jam jar1, Jam jar2) {
    this.jar1 = jar1;
    this.jar2 = jar2;
    this.jar3 = null;
    selected = null;
  }
  public Pantry (Jam jar1) {
    this.jar1 = jar1;
    this.jar2 = null;
    this.jar3 = null;
    selected = null;
  }

  // Methods
  public String toString() {
    String str = "";
    str += "1: " +  jar1.toString()  + "\n";
    if (jar2 != null)
      str += "2: " +  jar2.toString()  + "\n";

    if (jar3 != null)
      str += "3: " +  jar3.toString()  + "\n";     
    return str;
  }

  public void print() {
    System.out.println(this.toString());
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber ) {
    if ( jarNumber == 1 && jar1 != null) {
      selected =  jar1 ;
      return true;
    }

    if ( jarNumber == 2 && jar2 != null) {
      selected = jar2 ;
      return true;
    }

    if ( jarNumber == 3 && jar3 != null) {
      selected = jar3 ;
      return true;
    }
    else 
      return false;
  }

  // spread the selected jam
  public void spread( int oz ) {
    selected . spread( oz ) ;
  }
}