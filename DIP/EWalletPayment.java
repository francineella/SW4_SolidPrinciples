package DIP;

public class EWalletPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        EWalletService eWalletService = new EWalletService();
        eWalletService.pay(amount);
        System.out.println("You are paying with GCash");
    }
}
