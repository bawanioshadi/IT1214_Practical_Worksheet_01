public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "Author A", 300.0);
        Book book2 = new Book("Python Essentials", "Author B");
        
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + ", Price: $" + book1.getPrice());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + ", Price: $" + book2.getPrice());
    }
}