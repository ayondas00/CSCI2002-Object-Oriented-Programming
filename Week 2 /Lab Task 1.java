public class Book {

    String title;
    String author;
    double price;
    String category;

    // Constructor
    Book(String title, String author, double price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    void read() {
        System.out.println("Reading the book");
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Category: " + category;
    }

    public static void main(String[] args) {
        // **TODO** Auto-generated method stub

        Book b1 = new Book("Java Programming", "James Gosling", 750.0, "Programming");

        b1.read();
        b1.display();

        System.out.println(b1);
    }

}
