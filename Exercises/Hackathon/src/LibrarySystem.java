import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        Library PineAppleLibrary = new Library();

        // clear data to restart
        PineAppleLibrary.clearLibraryData();

        System.out.println("Welcome to PineAppleLibrary!!!");

        System.out.println("------------------------------------");
        PineAppleLibrary.addBook(new Book("The Three-Body Problem", "Liu Cixin", "Science Fiction", "1111111111", true));
        PineAppleLibrary.addBook(new Book("The Three Little Pigs", "Unknown", "Fairy Tale", "2222222222", true));
        PineAppleLibrary.addBook(new Book("The Hunger Games", "Suzanne Collins", "Science Fiction", "1234567890", true));
        PineAppleLibrary.addBook(new Book("Dune", "Frank Herbert", "Science Fiction", "0987654321", true));

        System.out.println("Current Book List:");
        PineAppleLibrary.displayAvailableBooks();

        PineAppleLibrary.checkOutBook("1234567890");
        System.out.println("Current Book List:");
        PineAppleLibrary.displayAvailableBooks();

        PineAppleLibrary.returnBook("1234567890");
        System.out.println("Current Book List:");
        PineAppleLibrary.displayAvailableBooks();

        System.out.println("------------------------------------");
        System.out.println("Searching for a book:");
        List<Book> foundBooks = PineAppleLibrary.searchBooks(null, null, "Science Fiction");
        for (Book book : foundBooks) {
            System.out.println(book);
        }

        PineAppleLibrary.removeBook("2222222222");
        System.out.println("Current Book List:");
        PineAppleLibrary.displayAvailableBooks();

        PineAppleLibrary.saveLibraryData("library_data.ser");
    }
}
