public class Book{
    //This class will represent a book with its properties and methods to check availability
    //properties
    String title; //The title of the book.
    String Author; //The author of the book
    String isbn;//The unique ISBN identifier of the book.
    boolean isAvailable;//Indicates if the book is available for checkout.

    public Book(String title,String Author,String isbn){
        this.title=title;
        this.Author=Author;
        this.isbn=isbn;
        this.isAvailable=true;
    }

    //methodes :
    //1  Returns the title of the book.
    public String getTitle(){
        return title;
    }
    //2 Returns the author of the book.
    public String getAuthor(){
        return Author;
    }
    //Returns the ISBN.
    public String getIsbn(){
        return isbn;
    }
    //return when book is available
    public boolean isAvailable(){
        return isAvailable;
    }
    //Marks the book as borrowed (changes isAvailable to false).
    public void borrowBook(){
        if(isAvailable){
            isAvailable=false; // so there is no more available
            System.out.println(title+" has been borrowed");

        }
        else{
            System.out.println("it is not available for borrowing");
        }
    }
    public void returnBook(){
        isAvailable=true; //so it is available again for borrowing
        System.out.println(title+" has been returned");
    }
}