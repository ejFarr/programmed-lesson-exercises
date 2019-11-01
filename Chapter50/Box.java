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
        width = side;
        height = side;
        length = side;
    }
    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }
    public Box biggerBox(Box oldBox) {
        return new Box (1.25 * oldBox.width(),1.25 * oldBox.length(), 1.25 * oldBox.height());
    }
    public double length() {
        return length;
    }
    public double width() {
        return width;
    }
    public double height() {
        return height;
    }
    private double topArea() {
        return width * length;
    }
    private double faceArea() {
        return height * length;
    }
    private double sideArea() {
        return height * width;
    }
    public double volume() {
        return height * width * length;
    }
    public double area() {
        return 2 * (topArea() + faceArea() + sideArea());
    }
    public String toString() {
        return "topArea: " + topArea();
    }
}