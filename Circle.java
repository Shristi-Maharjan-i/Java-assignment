import java.util.Scanner;

class Circle {
    private final double pi = 3.1416;
    private double r;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
        sc.close();
    }

    double calculate() {
        return pi * r * r;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.getdata();
        System.out.println("Area of the circle: " + c.calculate());
    }
}
