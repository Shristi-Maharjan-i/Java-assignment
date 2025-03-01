import java.util.Scanner;

class Box {
    private double length, breadth, height;

    void ReadData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        sc.close();
    }

    double Volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.ReadData();
        System.out.println("Volume of the box: " + myBox.Volume());
    }
}
