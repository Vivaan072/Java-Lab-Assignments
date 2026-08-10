class Book {

    // Final variable
    final String ISBN;

    String title;
    String author;
    double price;

    Book(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails() {
        System.out.println("Library Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }
}

public class LibraryBookDemo {

    public static void main(String[] args) {

        Book book = new Book(
                "978-0135166307",
                "Java Programming",
                "Herbert Schildt",
                850
        );

        book.displayBookDetails();

        // book.ISBN = "978-1234567890";
        // Error: cannot assign a value to final variable
    }
}