package Dao.Impl;

import Dao.LibraryDao;
import Model.Book;
import Model.Library;

import java.util.Map;

public class LibraryDaoImpl implements LibraryDao {
    Library library = new Library();

    @Override
    public String addBook(Book book) {
        library.getBooks().put(book.getISBN(), book);
        return null;
    }

    @Override
    public String removeBook(String ISBN) {
        library.getBooks().remove(ISBN) ;
        return null;
    }

    @Override
    public String searchBook(String keyWord) {
        for (Map.Entry<String, Book> book : library.getBooks().entrySet()) {
            if (book.getKey().equals(keyWord)) {
                return book.getKey() + " " + book.getValue();
            }
        }
        return "who is it?";
    }

    @Override
    public Map<String, Book> getAllBooks() {
        return library.getBooks();
    }
}
