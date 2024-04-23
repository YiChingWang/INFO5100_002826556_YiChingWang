import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Library {
    private List<Book> Books;
    private int bookCount;

    public Library() {
        Books = new ArrayList<>();
        bookCount = 0;
    }

    public void addBook(Book book) {
        Books.add(book);
        bookCount++;
        System.out.println("Add Book " + bookCount + ": " + book);
        System.out.println("------------------------------------");
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < Books.size(); i++) {
            if (Books.get(i).getIsbn().equals(isbn)) {
                String bookTitle = Books.get(i).getTitle();
                Books.remove(i);
                System.out.println("------------------------------------");
                System.out.println("Removed book: " + bookTitle);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found, cannot remove.");
    }

    public List<Book> searchBooks(String title, String author, String genre) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : Books) {
            if ((title == null || book.getTitle().equals(title)) &&
                    (author == null || book.getAuthor().equals(author)) &&
                    (genre == null || book.getGenre().equals(genre)) &&
                    book.isAvailable()) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void displayAvailableBooks() {
        for (Book book : Books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    public void checkOutBook(String isbn) {
        for (Book book : Books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailability(false);
                System.out.println("------------------------------------");
                System.out.println("Check out book: " + book.getTitle());
                return;
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Book not available for checkout.");
    }

    public void returnBook(String isbn) {
        for (Book book : Books) {
            if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
                book.setAvailability(true);
                System.out.println("------------------------------------");
                System.out.println("Return book: " + book.getTitle());
                return;
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Not found this book.");
    }

    //save data
    public void saveLibraryData(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(Books);
            System.out.println("------------------------------------");
            System.out.println("Library data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //clear data
    public void clearLibraryData() {
        Books.clear();
        System.out.println("------------------------------------");
        System.out.println("Library data cleared successfully.");
        System.out.println("------------------------------------");
    }
}


