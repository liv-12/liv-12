package biblos;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding some books to the library
        library.addBook(new Book("Java Programming", "John Doe", 2020));
        library.addBook(new Book("Python Basics", "Jane Smith", 2019));
        library.addBook(new Book("Data Structures", "Alice Johnson", 2018));

        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Lend a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Display Available Books");
            System.out.println("4. Display Borrowed Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book to lend: ");
                    String lendTitle = scanner.nextLine();
                    library.lendBook(lendTitle);
                    break;
                case 2:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 3:
                    library.displayAvailableBooks();
                    break;
                case 4:
                    library.displayBorrowedBooks();
                    break;
                case 5:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
