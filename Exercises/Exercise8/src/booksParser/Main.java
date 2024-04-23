package booksParser;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            List<book> XMLBooks = XMLBookParser.parseBooks("/Users/olliesmacbook/Desktop/Exercise8/src/books.xml");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Original XML Parsed Books Data:");
            XMLBookParser.printBooks(XMLBooks);

            List<book> JSONBooks = JSONBookParser.parseBooks("/Users/olliesmacbook/Desktop/Exercise8/src/books.json");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Original JSON Parsed Books Data:");
            JSONBookParser.printBooks(JSONBooks);

            book newBook = new book("Divergent", 2011, 487, Arrays.asList("Veronica Roth"));
            XMLBooks.add(newBook);
            JSONBooks.add(newBook);

            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Renewed XML Books Data:");
            XMLBookParser.printBooks(XMLBooks);

            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Renewed JSON Books Data:");
            JSONBookParser.printBooks(JSONBooks);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

