class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.area();
    }
}