package lab3;

public class StudyRoom extends Library{

    public static int totalBooks = 0;

    // Instance variables for the two books (arrays are not allowed)
    private String book1;
    private String book2;

    // Constructor calling the Grand Parent (Library) constructor
    public StudyRoom(String name) {
        super(name);
    }

    // Adds a book to the first available slot and increments the total count
    public void addBook(String bookName) {
        if (this.book1 == null) {
            this.book1 = bookName;
            totalBooks++;
        } else if (this.book2 == null) {
            this.book2 = bookName;
            totalBooks++;
        }
    }

    // Overrides showRoomInfo to display room-specific details and book status
    @Override
    public void showRoomInfo() {
        System.out.println(this.name + " Details:");
        if (this.book1 != null) {
            System.out.println("Book 1: " + this.book1);
        } else {
            System.out.println("No book added");
        }

        if (this.book2 != null) {
            System.out.println("Book 2: " + this.book2);
        } else {
            System.out.println("No book added");
        }
    }

    // Getters and Setters used by the SilentStudyRoom class for book transfers
    public String getBook1() {
        return this.book1;
    }

    public void setBook1(String bookName) {
        this.book1 = bookName;
    }

    public String getBook2() {
        return this.book2;
    }

    public void setBook2(String bookName) {
        this.book2 = bookName;
    }

    // Method to remove a book from a specific slot and decrement the total count
    public void removeBook(int bookNumber) {
        if (bookNumber == 1) {
            System.out.println("Book 1 Removed from " + this.name);
            this.book1 = null;
        } else if (bookNumber == 2) {
            System.out.println("Book 2 Removed from " + this.name);
            this.book2 = null;
        }
        totalBooks--;
    }
}
