package JavaProject;

public class Course {
	   private String name;
	   private static int totalCourses = 0;
	   public Course(String name) {
	       this.name = name;
	       totalCourses++;
	   }
	   public static int getTotalCourses() {
	       return totalCourses;
	   }
	   public static void main(String[] args) {
	       Course c1 = new Course("Java");
	       Course c2 = new Course("Python");
	       System.out.println("Total Courses: "
	               + Course.getTotalCourses());
	   }
	}
