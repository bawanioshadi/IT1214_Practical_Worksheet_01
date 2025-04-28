public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 101, "Information Technology");
        student.display();

        // Using setters to update values
        student.setName("John Doe");
        student.setRollNo(101);
        student.setCourse("Information Technology");

        // Using getters to retrieve values
        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Course: " + student.getCourse());
    }
}