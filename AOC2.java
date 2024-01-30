interface Shape2D {
    double getArea();
}

abstract class Shape1 {
    abstract void display();
}

class Circle1 extends Shape1 implements Shape2D {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    void display() {
        System.out.println("Displaying Circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class AOC2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle.display(); // Invoking display method of Circle
        System.out.println("Area of Circle: " + circle.getArea());
    }
}
