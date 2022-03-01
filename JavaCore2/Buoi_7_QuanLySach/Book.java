
import java.util.Date;

public class Book {
    int id;
    String name;
    String bookCategory;
    int datePrint;

    public Book(int id, String bookCategory, String name, int datePrint) {
        this.id = id;
        this.name = name;
        this.bookCategory = bookCategory;
        this.datePrint = datePrint;
    }

    @Override
    public String toString() {
        return id + " | " + bookCategory + " | " + name + " | " + datePrint;
    }

}