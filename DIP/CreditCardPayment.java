package DIP;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        CreditCardService creditCard = new CreditCardService();
        creditCard.charge(amount);
        System.out.println("You are paying with Credit Card");
    }
}
