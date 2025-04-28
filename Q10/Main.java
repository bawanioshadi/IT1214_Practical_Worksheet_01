class Employee {
    String name;
    int id;
    double salary;

    // Employee constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display basic employee details
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    // Manager constructor
    Manager(String name, int id, double salary) {
        super(name, id, salary);  // Calls Employee constructor
    }

    @Override
    void displayDetails() {
        super.displayDetails();  // Calls Employee's displayDetails()
        double bonus = calculateBonus();
        System.out.println("Bonus (10% of salary): $" + bonus);
        System.out.println("Total Compensation: $" + (salary + bonus));
    }

    // Calculate manager's bonus (10% of salary)
    private double calculateBonus() {
        return salary * 0.10;
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Bob", 201, 75000);
        manager.displayDetails();
    }
}