import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {  // Basic age validation
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be between 0 and 120.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        // Accepting user input
        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        person.setAge(age);

        // Displaying details
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        scanner.close();
    }
}