abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("This is an abstract class.");
    }
}

final class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.message();
        c.draw();
    }
}
