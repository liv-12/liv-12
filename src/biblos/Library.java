package biblos;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void lendBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book " + title + " has been lent.");
                return;
            }
        }
        System.out.println("Book " + title + " is not available for lending.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Book " + title + " has been returned.");
                return;
            }
        }
        System.out.println("Book " + title + " was not borrowed or does not exist in the library.");
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYearPublished());
            }
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : books) {
            if (!book.isAvailable()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYearPublished());
            }
        }
    }
}
