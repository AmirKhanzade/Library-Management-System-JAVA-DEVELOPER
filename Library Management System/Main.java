public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create books
        Book book1 = new Book("1984", "George Orwell", "123456");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "654321");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "112233");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create a user
        User user1 = new User("John Doe", 1);
        library.registerUser(user1);

        // List all books in the library
        library.listBooks();

        // Borrow a book
        user1.borrowBook(book1);

        // Try borrowing an unavailable book
        user1.borrowBook(book1);

        // List books again after borrowing
        library.listBooks();

        // Return the borrowed book
        user1.returnBook(book1);

        // List books after returning
        library.listBooks();
    }
}
