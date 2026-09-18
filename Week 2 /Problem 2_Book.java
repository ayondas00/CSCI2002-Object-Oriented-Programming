package javacode;

public class Book {

    String title;
    String author;
    double price;
    String category;

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

        Book b1 = new Book();

        b1.title = "Java Programming";
        b1.author = "James Gosling";
        b1.price = 750.0;
        b1.category = "Programming";

        b1.read();
        b1.display();

        System.out.println(b1);
    }
}
