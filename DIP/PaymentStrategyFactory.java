package DIP;

public class PaymentStrategyFactory {
    public PaymentStrategy createPaymentStrategy(String paymentMethod) {
        if (paymentMethod.equals("ewallet")) {
            return new EWalletPayment();
        } else if (paymentMethod.equals("cash")) {
            return new CashPayment();
        } else if (paymentMethod.equals("creditcard")) {
            return new CreditCardPayment();
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }
}
