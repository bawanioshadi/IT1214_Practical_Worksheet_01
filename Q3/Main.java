public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test all overloaded add() methods
        System.out.println("Sum of two integers: " + calc.add(5, 10));          // 15
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));   // 30
        System.out.println("Sum of two doubles: " + calc.add(3.5, 2.7));       // 6.2
    }
}