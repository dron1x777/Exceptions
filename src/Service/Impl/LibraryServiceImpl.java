package Service.Impl;

import Dao.Impl.LibraryDaoImpl;
import Model.Book;
import Model.Exception.BookNotFound;
import Service.LibraryService;

import java.util.Map;

public class LibraryServiceImpl implements LibraryService {
    LibraryDaoImpl dao = new LibraryDaoImpl();

    @Override
    public String addBook(Book book) throws BookNotFound {
        if (book.getISBN() == null) {
            throw new BookNotFound("ISBN is null");
        }
        if (book.getTitle() == null) {
            throw new BookNotFound("Title is null");
        }
        if (book.getAuthor() == null) {
            throw new BookNotFound("Author is null");
        }
        dao.addBook(book);
        return "book added successfully";
    }

    @Override
    public String removeBook(String ISBN) throws BookNotFound {
        if (ISBN == null) {
            throw new BookNotFound("ISBN is null");
        }
        dao.removeBook(ISBN);
        return "book removed successfully";
    }

    @Override
    public String searchBook(String keyWord) throws BookNotFound {
        if (keyWord == null) {
            throw new BookNotFound("keyWord is null");
        }
        dao.searchBook(keyWord);
        return "book searched successfully";
    }

    @Override
    public Map<String, Book> getAllBooks() throws BookNotFound {
        if (dao.getAllBooks() == null) {
            throw new BookNotFound("allBooks is null");
        }
        System.out.println("allBooks is " + dao.getAllBooks());
        return null;
    }
}
