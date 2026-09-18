package javacode;

public class StudentCons {

    String name;
    int id;
    double cgpa;
    String dep;

    // Default constructor
    StudentCons() {
        name = "Unknown";
        id = 0;
        cgpa = 0.0;
        dep = "Unknown";
    }

    // Constructor with two parameters
    StudentCons(String name, int id) {
        this.name = name;
        this.id = id;
        cgpa = 0.0;
        dep = "Unknown";
    }

    // Constructor with four parameters
    StudentCons(String name, int id, double cgpa, String dep) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.dep = dep;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + dep);
    }

    public static void main(String[] args) {
        // **TODO** Auto-generated method stub

        StudentCons s1 = new StudentCons();

        StudentCons s2 = new StudentCons("Karim", 101);

        StudentCons s3 = new StudentCons("Rahim", 102, 3.75, "CSE");

        System.out.println("Student 1:");
        s1.display();

        System.out.println();

        System.out.println("Student 2:");
        s2.display();

        System.out.println();

        System.out.println("Student 3:");
        s3.display();
    }

}
