package Dao;

import Model.Book;

import java.util.Map;

public interface LibraryDao {
    public String addBook(Book book);
    public String removeBook(String ISBN);
    public String searchBook(String keyWord);
    public Map<String, Book> getAllBooks();
}
