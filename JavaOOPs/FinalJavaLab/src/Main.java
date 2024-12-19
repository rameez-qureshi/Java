import java.util.ArrayList;

class Book {
    private String bookName;
    private String isbn;
    private String authorName;
    private String publisher;


    // CONSTRUCTOR
    public Book(String bookName, String isbn, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    // MUTATORS and ACCESSORS
    public void getBookInfo() {
        System.out.println("Book Name: " + bookName + "\nISBN: " + isbn + "\nAuthor: " + authorName + "\nPublisher: " + publisher);
    }
}

class BookManager {
    private ArrayList<Book> booksList;
    public BookManager() {
        booksList = new ArrayList<Book>();
    }

    public void addBook(Book element) {
        booksList.add(element);
    }
    public void displayBookInfo() {
        for(int i = 0;i<booksList.size();i++)
        {
            booksList.get(i).getBookInfo();
            System.out.println();
        }
//        for (Book book : booksList) {
//            book.getBookInfo();
//            System.out.println();
//        }
    }
}

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.addBook(new Book("Book1", "ISBN1", "Author1", "Publisher1"));
        bookManager.addBook(new Book("Book2", "ISBN2", "Author2", "Publisher2"));
        bookManager.addBook(new Book("Book3", "ISBN3", "Author3", "Publisher3"));
        bookManager.addBook(new Book("Book4", "ISBN4", "Author4", "Publisher4"));
        bookManager.addBook(new Book("Book5", "ISBN5", "Author5", "Publisher5"));

        bookManager.displayBookInfo();
    }
}