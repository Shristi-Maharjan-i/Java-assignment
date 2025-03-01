import java.util.Scanner;

class Book {
    private String book_name, ISBN, author;
    private double price;

    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        book_name = sc.nextLine();
        System.out.print("Enter ISBN: ");
        ISBN = sc.nextLine();
        System.out.print("Enter author name: ");
        author = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.close();
    }

    void displayData() {
        System.out.println("\nBook Details:");
        System.out.println("Name: " + book_name);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.readData();
        myBook.displayData();
    }
}

