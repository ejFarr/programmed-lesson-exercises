public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public void setHeight(double height) {
        if ( height >= 0 )
            this.height = height;
    }
    
    public void setRadius(double radius) {
        if ( radius >= 0 )
            this.radius = radius;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getRadius() {
        return radius;
    }
    public double volume() {
        return Math.PI * (radius * radius) * height;
    }
    public double surfaceArea() {
        return (2 * Math.PI * (radius * radius)) + (2 * Math.PI * radius * height);
    }
}