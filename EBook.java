package library;

// Inheritance: EBook extends Book
// Polymorphism: different implementation of calculateLateFee()

public class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        // Lower fee for ebooks since no physical copy
        return daysLate * 0.50;
    }
}
