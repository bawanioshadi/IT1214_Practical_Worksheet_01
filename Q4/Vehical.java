class Vehicle {
    String brand;
    int speed;
    
    void display() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String model;
    
    @Override
    void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}