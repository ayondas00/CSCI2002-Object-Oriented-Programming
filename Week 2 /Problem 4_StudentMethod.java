package javacode;

public class StudentMethod {

    // Method with no parameters
    void display() {
        System.out.println("No student information available");
    }

    // Method with two parameters
    void display(String name, int id) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    // Method with four parameters
    void display(String name, int id, double cgpa, String dep) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + dep);
    }

    public static void main(String[] args) {
        // **TODO** Auto-generated method stub

        StudentMethod s1 = new StudentMethod();

        s1.display();

        System.out.println();

        s1.display("Karim", 101);

        System.out.println();

        s1.display("Rahim", 102, 3.75, "CSE");
    }

}
