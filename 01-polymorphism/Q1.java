// Q1 — Polymorphism: What is the output?

class Animal {
    String name = "Animal";

    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    String name = "Dog";  // field hiding, NOT overriding

    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.name);   // Line A
        a.speak();                     // Line B
    }
}
