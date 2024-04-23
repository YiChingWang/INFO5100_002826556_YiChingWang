package booksParser;

import java.util.List;

public class book {
    private String title;
    private int publishedYear;
    private int numberOfPages;
    private List<String> authors;

    public book(String title, int publishedYear, int numberOfPages, List<String> authors) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book" +
                "\n- Title : " + title +
                "\n- PublishedYear : " + publishedYear +
                "\n- NumberOfPages : " + numberOfPages +
                "\n- Authors : " + authors;
    }
}

