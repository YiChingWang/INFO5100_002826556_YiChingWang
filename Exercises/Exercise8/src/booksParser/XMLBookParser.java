package booksParser;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XMLBookParser {
    public static List<book> parseBooks(String xmlFile) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(xmlFile));

        List<book> books = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element && node.getNodeName().equals("Book")) {
                books.add(parseBook((Element) node));
            }
        }

        return books;
    }

    private static book parseBook(Element element) {
        String title = element.getElementsByTagName("title").item(0).getTextContent();
        int publishedYear = Integer.parseInt(element.getElementsByTagName("publishedYear").item(0).getTextContent());
        int numberOfPages = Integer.parseInt(element.getElementsByTagName("numberOfPages").item(0).getTextContent());
        List<String> authors = new ArrayList<>();
        NodeList authorList = element.getElementsByTagName("author");
        for (int j = 0; j < authorList.getLength(); j++) {
            authors.add(authorList.item(j).getTextContent());
        }
        return new book(title, publishedYear, numberOfPages, authors);
    }

    public static void printBooks(List<book> books) {
        for (booksParser.book book : books) {
            System.out.println(book);
        }
    }
}

