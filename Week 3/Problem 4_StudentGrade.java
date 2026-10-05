package JavaProject;

enum Grade {
	   A, B, C, D, F
	}
	public class StudentGrade {
	   private String name;
	   private Grade grade;
	   public StudentGrade(String name, Grade grade) {
	       this.name = name;
	       this.grade = grade;
	   }
	   public static void main(String[] args) {
	       StudentGrade student =
	               new StudentGrade("Rahim", Grade.C);
	       System.out.println("Student Name: " + student.name);
	       System.out.println("Grade: " + student.grade);
	   }
	}
