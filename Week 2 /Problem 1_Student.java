package javacode;

public class Student {

    String name;
    int id;
    double cgpa;
    String dep;

    void study() {
        System.out.println("Student is studying");
    }

    void display() {
        System.out.println(name + " " + id + " " + cgpa);
    }
    
//  public String toString() {
//  	return "ClassName@hashcode";
//  }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Dep: " + dep;
    }
    
    public static void main(String[] args) {
        // **TODO** Auto-generated method stub

        Student s1 = new Student();

        s1.name = "Karim";
        s1.id = 101;
        s1.cgpa = 3.00;
        s1.dep = "CSE";

        s1.study();
        s1.display();

        System.out.println(s1);
    }

}
