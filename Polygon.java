class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the child class (overridden method).");
    }
}

public class FunctionOverriding {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display();

        Child obj2 = new Child();
        obj2.display();
    }
}
class Polygon {
    protected double dimension1, dimension2;

    Polygon(double d1, double d2) {
        this.dimension1 = d1;
        this.dimension2 = d2;
    }
}

class Rectangle extends Polygon {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    double calculateArea() {
        return dimension1 * dimension2;
    }
}

class Triangle extends Polygon {
    Triangle(double base, double height) {
        super(base, height);
    }

    double calculateArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class PolygonTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Rectangle Area: " + rect.calculateArea());

        Triangle tri = new Triangle(10, 15);
        System.out.println("Triangle Area: " + tri.calculateArea());
    }
}
