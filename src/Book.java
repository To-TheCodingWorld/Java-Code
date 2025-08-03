import java.util.Locale;

public class Book {
    static int TotalNoOfBooks;
    String title;
    String Author;
    String ISBN;
    boolean isBorrowed;

    static {
        TotalNoOfBooks = 0;
    }

    {
        TotalNoOfBooks++;
    }

    Book(String title, String Author, String ISBN) {
        this.Author = Author;
        this.ISBN = ISBN;
        this.title = title;
    }

    Book(String ISBN) {
        this(ISBN, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return TotalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("The Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the books :" +this.title);
        }
    }

    void ReturnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope You enjoyed the books");
        } else {
            System.out.println("This book is already in the library");
        }
    }


    public static void main(String[] args) {
        Book FirstBook = new Book("The User", "Design", "788");
        Book SecondBook= new Book("767");
        System.out.println(Book.getTotalNoOfBooks());
        FirstBook.borrowBook();
        SecondBook.borrowBook();
        FirstBook.borrowBook();
        FirstBook.ReturnBook();
        FirstBook.ReturnBook();
    }
}
