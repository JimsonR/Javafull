// Define the interface
interface Shape9 {
    double area();
    double perimeter();
}

// Implement the interface in the Circle class
class Circle9 implements Shape9 {
    private double radius;

    // Constructor
    public Circle9(double radius) {
        this.radius = radius;
    }

    // Implement the area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implement the perimeter method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Implement the interface in the Rectangle class
class Rectangle implements Shape9{
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the area method
    @Override
    public double area() {
        return length * width;
    }

    // Implement the perimeter method
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the implementation
public class InterfaceExample1 {
    public static void main(String[] args) {
        Shape9 circle = new Circle9(5.0);
        Shape9 rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}