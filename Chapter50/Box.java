public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Box(double side) {

    }
    public double volume() {
        return height * width * length;
    }
    public double area() {
        return 2 * ((height * width) + (height * length) + (length * width));
    }
    
}