package javacode;

public class Student {

    String name;
    int id;
    double cgpa;
    String dep;

    // Constructor
    Student(String name, int id, double cgpa, String dep) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.dep = dep;
    }

    void study() {
        System.out.println("Student is studying");
    }

    void display() {
        System.out.println(name + " " + id + " " + cgpa);
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Dep: " + dep;
    }

    public static void main(String[] args) {
        // **TODO** Auto-generated method stub

        Student s1 = new Student("Karim", 101, 3.00, "CSE");

        s1.study();
        s1.display();

        System.out.println(s1);
    }

}
