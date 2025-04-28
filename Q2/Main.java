public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();      // Default constructor (0, 0)
        Rectangle rect2 = new Rectangle(5, 10);  // Parameterized constructor (5, 10)

        System.out.println("Area of rect1: " + rect1.area());  // Output: 0
        System.out.println("Area of rect2: " + rect2.area());  // Output: 50
    }
}