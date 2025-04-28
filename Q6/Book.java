public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor with all attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor without price (defaults to 0)
    public Book(String title, String author) {
        this(title, author, 0.0); // Calls the 3-parameter constructor
    }

    // Getters for all fields
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setters for all fields
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}