abstract class Shape {
    int dimension1;
    int dimension2;
  
    Shape(int d1, int d2) {
        this.dimension1 = d1;
        this.dimension2 = d2;
    }
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    // Constructor to initialize dimensions
    Triangle(int base, int height) {
        super(base, height);
    }
    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}


class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }
    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(8, 4);
        Shape circle = new Circle(7);
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
