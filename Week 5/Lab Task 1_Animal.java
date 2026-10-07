package JavaProject;

abstract class AnimalType {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends AnimalType {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends AnimalType {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Animal {

    public static void main(String[] args) {

        AnimalType dog = new Dog();
        AnimalType cat = new Cat();

        dog.sound();
        dog.sleep();
        dog.eat();

        System.out.println();

        cat.sound();
        cat.sleep();
        cat.eat();
    }
}

