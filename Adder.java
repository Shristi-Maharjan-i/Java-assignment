public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("Addition of two integers: " + adder.add(5, 3));
        System.out.println("Addition of two doubles: " + adder.add(5.5, 3.3));
    }
}
