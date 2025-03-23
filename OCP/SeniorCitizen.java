package OCP;

public class SeniorCitizen extends AbstractCustomer {
    public SeniorCitizen (String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}
