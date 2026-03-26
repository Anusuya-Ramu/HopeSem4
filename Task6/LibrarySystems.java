package Task6;
class Library {
    String bookName;
    int bookId;
    boolean isIssued;
    Library(String bookName, int bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.isIssued = false;
    }
    void display() {
        System.out.println("Book: " + bookName);
        System.out.println("ID: " + bookId);
        System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
        System.out.println();
    }
    void issue() {
        if (isIssued == false) {
            isIssued = true;
            System.out.println(bookName + " issued");
        } else {
            System.out.println(bookName + " already issued");
        }
    }
    void returnBook() {
        if (isIssued == true) {
            isIssued = false;
            System.out.println(bookName + " returned");
        } else {
            System.out.println(bookName + " not issued");
        }
    }
}

public class LibrarySystems {
    public static void main(String[] args) {

        Library b1 = new Library("Java", 1);
        Library b2 = new Library("DSA", 2);

        // Display
        b1.display();
        b2.display();

        // Issue book
        b1.issue();

        // Return book
        b1.returnBook();

        // Final display
        b1.display();
    }
}