package JavaProject;

abstract class AnimalType {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends AnimalType {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Animal {

    public static void main(String[] args) {

        AnimalType a = new Dog();

        a.sound();
        a.sleep();
    }
}
