
import java.util.ArrayList;

class Book{
    private String bookName;
    private String isbn;
    private String authorName;
    private String publisher;

    public Book(String bookName, String isbn, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public String getBookInfo() {
        return "Title: " + bookName + "ISBN: " + isbn + "Author: " + authorName + "Publisher: " + publisher;
    }
}

class BookManager {
    private ArrayList<Book> booksList ;

    public BookManager() {

        booksList = new ArrayList<>();
    }

    public void addBook(Book book) {

        booksList.add(book);
    }
    public void displayBookInfo() {
        for (Book book : booksList) {
            System.out.println(book.getBookInfo() + "\n");
        }
    }
}

public class BookTest {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.addbook(new Book("BookName1", "ISBN1", "Author1", "Publisher1"));
        bookManager.addBook(new Book("BookName2", "ISBN2", "Author2", "Publisher2"));
        bookManager.addBook(new Book("BookName3", "ISBN3", "Author3", "Publisher3"));
        bookManager.addBook(new Book("BookName4", "ISBN4", "Author4", "Publisher4"));

        bookManager.displayBookInfo();
    }
}

