// Q2 — Polymorphism: What is the output?

class Shape {
    Shape() {
        draw();  // calling overridden method from constructor
    }

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    int radius = 5;

    Circle() {
        super();
        System.out.println("Circle created, radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle, radius = " + radius);
    }
}

public class Q2 {
    public static void main(String[] args) {
        new Circle();
    }
}
