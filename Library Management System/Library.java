import java.util.ArrayList;
import java.util.List;

public class Library {
    //This class will manage the collection of books and users.
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            String availability = book.isAvailable() ? "Available" : "Not Available";
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + availability + ")");
        }
    }
}
