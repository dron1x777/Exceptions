package Model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new LinkedHashMap<>();
    public Library() {
    }
    public Library(Map<String, Book> books) {
        this.books = books;
    }
    public Map<String, Book> getBooks() {
        return books;
    }
    public void setBooks(Map<String, Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
