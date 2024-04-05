import java.io.*;
class Book implements Serializable {
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private boolean availability;

    public Book(String title, String author, String genre, String isbn, boolean availability) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "\n- Title: " + title + "\n- Author: " + author + "\n- Genre: " + genre +
                "\n- ISBN: " + isbn + "\n- Available: " + (availability ? "Yes" : "No");
    }
}