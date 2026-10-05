package JavaProject;

class BaseShape {
	   String color;
	   BaseShape() {
	       System.out.println("Shape constructor called");
	   }
	   void show() {
	       System.out.println("This is a Shape");
	   }
	}
	class Circle extends BaseShape {
	   double radius;
	   Circle() {
	       super();
	       System.out.println("Circle constructor called");
	   }
	   double area() {
	       return 3.14 * radius * radius;
	   }
	   @Override
	   void show() {
	       super.show();
	       System.out.println("This is a Circle");
	   }
	}
	class Rectangle extends BaseShape {
	   double length;
	   double width;
	   Rectangle() {
	       super();
	       System.out.println("Rectangle constructor called");
	   }
	   double area() {
	       return length * width;
	   }
	   @Override
	   void show() {
	       super.show();
	       System.out.println("This is a Rectangle");
	   }
	}
	public class Shape {
	   public static void main(String[] args) {
	       System.out.println("---- Creating Rectangle ----");
	       Rectangle r = new Rectangle();
	       r.color = "Blue";
	       r.length = 4;
	       r.width = 5;
	       r.show();
	       System.out.println("Color: " + r.color);
	       System.out.println("Rectangle Area: " + r.area());
	   
	   	System.out.println("\n---- Creating Circle ----");
	       Circle c = new Circle();
	       c.color = "Red";
	       c.radius = 3;
	       c.show();
	       System.out.println("Color: " + c.color);
	       System.out.printf("Circle Area: %.2f%n", c.area());
	   }
	}
