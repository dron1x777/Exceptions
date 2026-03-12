import Model.Book;
import Service.Impl.LibraryServiceImpl;
import Service.LibraryService;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        LibraryService libraryService = new LibraryServiceImpl();
        String ISBN = "";
        String author = "";
        String title = "";

        while (true) {
            menu();
            System.out.println("Your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter ISBN: ");
                    ISBN = sc.next();
                    System.out.println("Enter Author: ");
                    author = sc.next();
                    System.out.println("Enter Title: ");
                    title = sc.next();

                    try {
                        libraryService.addBook(new Book(author, ISBN, title));
                    }  catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter ISBN: ");
                    ISBN = sc.next();
                    try {
                        libraryService.removeBook(ISBN);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter ISBN: ");
                    ISBN = sc.next();
                    try {
                        libraryService.searchBook(ISBN);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        libraryService.getAllBooks();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Bye Bye!");
                    System.exit(0);
                    break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
            }
        }
    }
    public static void menu() {
        System.out.println("""
                1. add book
                2. remove book
                3. search book
                4. get all books
                5. exit""");
    }
}