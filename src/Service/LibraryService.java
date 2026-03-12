package Service;

import Model.Book;
import Model.Exception.BookNotFound;

import java.util.Map;

public interface LibraryService {
    public String addBook(Book book) throws BookNotFound;
    public String removeBook(String ISBN) throws BookNotFound;
    public String searchBook(String keyWord) throws BookNotFound;
    public Map<String, Book> getAllBooks() throws BookNotFound;
}
