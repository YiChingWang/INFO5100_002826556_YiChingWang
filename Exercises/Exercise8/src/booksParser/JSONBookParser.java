package booksParser;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONBookParser {
    public static List<book> parseBooks(String jsonFile) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get(jsonFile)));
        JSONObject jsonObject = new JSONObject(content);
        JSONArray jsonArray = jsonObject.getJSONArray("BookShelf");

        List<book> books = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject bookObject = jsonArray.getJSONObject(i);
            books.add(parseBook(bookObject));
        }

        return books;
    }

    private static book parseBook(JSONObject jsonObject) {
        String title = jsonObject.getString("title");
        int publishedYear = jsonObject.getInt("publishedYear");
        int numberOfPages = jsonObject.getInt("numberOfPages");
        JSONArray authorsJson = jsonObject.getJSONArray("authors");
        List<String> authors = new ArrayList<>();
        for (int j = 0; j < authorsJson.length(); j++) {
            authors.add(authorsJson.getString(j));
        }
        return new book(title, publishedYear, numberOfPages, authors);
    }

    public static void printBooks(List<book> books) {
        for (booksParser.book book : books) {
            System.out.println(book);
        }
    }
}

