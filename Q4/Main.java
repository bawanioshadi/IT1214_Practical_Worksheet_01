public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Toyota";
        vehicle.speed = 120;
        
        // Create a Car object
        Car car = new Car();
        car.brand = "Honda";
        car.model = "Civic";
        car.speed = 180;
        
        // Display details
        System.out.println("--- Vehicle ---");
        vehicle.display();
        
        System.out.println("\n--- Car ---");
        car.display();
    }
}