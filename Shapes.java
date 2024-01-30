abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

public class Shapes {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(4, 6);
        Shape square = new Square(7);

        // Using dynamic method dispatch to call the correct version of area()
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}
