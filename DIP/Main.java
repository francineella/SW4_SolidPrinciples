package DIP;

public class Main {
    public static void main(String[] args) {
        PaymentStrategyFactory factory = new PaymentStrategyFactory();
        PaymentProcessor processor = new PaymentProcessor(factory);
        
        Order cashOrder = new Order(100.0, "cash");
        processor.processPayment(cashOrder);
        
        Order cardOrder = new Order(250.0, "creditcard");
        processor.processPayment(cardOrder);
        
        Order eWalletOrder = new Order(75.0, "ewallet");
        processor.processPayment(eWalletOrder);
    }
}