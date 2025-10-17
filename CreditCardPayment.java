package library;

// Single Responsibility: handles only payment logic
// Dependency Inversion: will be used through interface Payment

public class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " using card: " + maskCardNumber());
    }

    private String maskCardNumber() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
