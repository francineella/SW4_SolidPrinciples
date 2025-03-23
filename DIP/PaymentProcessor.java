package DIP;

public class PaymentProcessor {
    private PaymentStrategyFactory paymentStrategyFactory;
    
    public PaymentProcessor(PaymentStrategyFactory paymentStrategyFactory) {
        this.paymentStrategyFactory = paymentStrategyFactory;
    }
    
    public void processPayment(Order order) {
        PaymentStrategy paymentStrategy = paymentStrategyFactory.createPaymentStrategy(order.getPaymentMethod());
        paymentStrategy.processPayment(order.getAmount());
    }
}
