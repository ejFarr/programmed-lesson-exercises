public class TestCone {
    public static void main(String[] args) {
    Cone cone  = new Cone( 1.2, 4.56 );
    System.out.println( "cone area: " + cone.area() 
      + " volume: " + cone.volume() );

    cone      = new Cone( 3.0, 1.2 );
    System.out.println( "cone area: " + cone.area() 
      + " volume: " + cone.volume() );

  }
}