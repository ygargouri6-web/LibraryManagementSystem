package library;

// Dependency Inversion Principle: LibraryApp depends on abstraction (Payment)

public class LibraryApp {
    public static void main(String[] args) {
        Book ebook = new EBook("Digital Fortress", "Dan Brown", 9.99);
        Book printed = new PrintedBook("Clean Code", "Robert C. Martin", 29.99);

        System.out.println(ebook);
        System.out.println("EBook late fee: $" + ebook.calculateLateFee(3));

        System.out.println(printed);
        System.out.println("PrintedBook late fee: $" + printed.calculateLateFee(3));

        // Dependency Injection: using interface to process payment
        Payment payment = new CreditCardPayment("1234567812345678");
        payment.processPayment(printed.getPrice());
    }
}
