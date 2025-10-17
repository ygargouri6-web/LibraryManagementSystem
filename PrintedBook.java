package library;

// Inheritance: PrintedBook extends Book
// Polymorphism: custom implementation of calculateLateFee()

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        // Higher fee for printed books
        return daysLate * 1.00;
    }
}
