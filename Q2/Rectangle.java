class Rectangle {
    private int length;
    private int breadth;

    // Default constructor 
    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Area calculation method
    public int area() {
        return length * breadth;
    }
}