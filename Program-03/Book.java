import java.util.Scanner;

class Book {
    private String name, author;
    private double price;
    private int num_pages;

    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    @Override
    public String toString() {
        return "Book Details: \n" +
               "Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: $" + price + "\n" +
               "Pages: " + num_pages + "\n";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Pages: ");
            int num_pages = scanner.nextInt();
            scanner.nextLine();  

            books[i] = new Book(name, author, price, num_pages);
        }

        System.out.println("\n--- Book Details ---");
        for (Book book : books) {
            System.out.println(book);
        }

        scanner.close();
    }
}
