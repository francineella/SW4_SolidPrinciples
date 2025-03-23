package OCP;

public class Regular extends AbstractCustomer {
    public Regular (String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(double amount) {
        return 0.0;
    }
}
