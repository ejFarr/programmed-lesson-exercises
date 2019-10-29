public class CylinderTester {
    public static void main (String[] args) {
        Cylinder cylinder = new Cylinder(3.25, 5.2);
        System.out.println("Cylinder voulume: " + cylinder.volume() + "\tCylinder surface area: " + cylinder.surfaceArea());

        cylinder = new Cylinder(2.3, 7.4);
        System.out.println("Cylinder voulume: " + cylinder.volume() + "\tCylinder surface area: " + cylinder.surfaceArea());
    }
}