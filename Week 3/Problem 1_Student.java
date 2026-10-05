package JavaProject;

public class Student {
   // Private data members
   private String name;
   private int age;
   private double cgpa;
   // Setter for name
   public void setName(String name) {
       this.name = name;
   }
   // Setter for age
   public void setAge(int age) {
       if (age >= 0) {
           this.age = age;
       }
   }
   // Setter for CGPA
   public void setCgpa(double cgpa) {
       if (cgpa >= 0 && cgpa <= 4.0) {
           this.cgpa = cgpa;
       }
   }
   // Getter for name
   public String getName() {
       return name;
   }
   // Getter for age
   public int getAge() {
       return age;
   }
   // Getter for CGPA
   public double getCgpa() {
       return cgpa;
   }
   // Main method
   public static void main(String[] args) {
       Student student = new Student();
       // Setting values using setters
       student.setName("Rahim");
       student.setAge(25);
       student.setCgpa(3.50);
       // Getting values using getters
       System.out.println("Name: " + student.getName());
       System.out.println("Age: " + student.getAge());
       System.out.println("CGPA: " + student.getCgpa());
   }
}
