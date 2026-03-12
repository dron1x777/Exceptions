package Model;

public class Book {
    private String ISBN;
    private String title;
    private String author;

    public Book(String author, String ISBN, String title) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
