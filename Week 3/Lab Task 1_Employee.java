package JavaProject;

public class Employee {
	   // Private fields
	   private String employeeId;
	   private String name;
	   private double salary;
	   // Constructor
	   public Employee(String employeeId) {
	       this.employeeId = employeeId;
	   }
	   // Setter for name
	   public void setName(String name) {
	       this.name = name;
	   }
	   // Setter for salary
	   public void setSalary(double salary) {
	       if (salary >= 0) {
	           this.salary = salary;
	       }
	   }
	   // Getter for employee ID
	   public String getEmployeeId() {
	       return employeeId;
	   }
	   // Getter for name
	   public String getName() {
	       return name;
	   }
	   // Getter for salary
	   public double getSalary() {
	       return salary;
	   }
	   // Main method
	   public static void main(String[] args) {
	       // Create Employee object
	       Employee emp1 = new Employee("E101");
	       // Set employee information
	       emp1.setName("Rahim");
	       emp1.setSalary(50000);
	       // Display employee information
	       System.out.println("Employee ID: " + emp1.getEmployeeId());
	       System.out.println("Name: " + emp1.getName());
	       System.out.println("Salary: " + emp1.getSalary());
	   }
	}
