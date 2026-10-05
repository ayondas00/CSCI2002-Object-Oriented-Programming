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

class Triangle extends BaseShape {
    double base;
    double height;

    Triangle() {
        super();
        System.out.println("Triangle constructor called");
    }

    double area() {
        return 0.5 * base * height;
    }

    @Override
    void show() {
        super.show();
        System.out.println("This is a Triangle");
    }
}

public class Shape {
    public static void main(String[] args) {
        System.out.println("---- Creating Triangle ----");
        Triangle t = new Triangle();
        t.color = "Green";
        t.base = 6;
        t.height = 4;
        t.show();
        System.out.println("Color: " + t.color);
        System.out.println("Triangle Area: " + t.area());
    }
}
