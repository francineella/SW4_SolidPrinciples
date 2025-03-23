package OCP;

public interface Customer {
    String getName();
    double calculateDiscount(double amount);
    double applyDiscount(double amount);
}
