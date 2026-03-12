package Dao.Impl;

import Dao.LibraryDao;
import Model.Book;
import Model.Library;

import java.util.Map;

public class LibraryDaoImpl implements LibraryDao {
    private Library library = new Library();

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
    public Book searchBook(String keyWord) {
        for (Map.Entry<String, Book> entry : library.getBooks().entrySet()) {
            if (entry.getValue().getISBN().equals(keyWord)) {
                return entry.getValue();
            }
        }
        return library.getBooks().get(keyWord);
    }

    @Override
    public Map<String, Book> getAllBooks() {
        return library.getBooks();
    }
}
