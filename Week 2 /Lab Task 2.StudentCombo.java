package javacode;

public class StudentCombo {

    String name;
    int id;

    // Default constructor
    StudentCombo() {
        name = "Unknown";
        id = 0;
    }

    // Parameterized constructor
    StudentCombo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method with no parameter
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    // Method with one parameter
    void display(String dep) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + dep);
    }

    public static void main(String[] args) {
        // **TODO** Auto-generated method stub

        StudentCombo s1 = new StudentCombo();

        StudentCombo s2 = new StudentCombo("Karim", 101);

        System.out.println("Student 1:");
        s1.display();
        s1.display("EEE");

        System.out.println();

        System.out.println("Student 2:");
        s2.display();
        s2.display("CSE");
    }

}
