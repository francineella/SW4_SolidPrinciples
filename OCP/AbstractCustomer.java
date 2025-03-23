package OCP;

public abstract class AbstractCustomer implements Customer{
    private String name;

    public AbstractCustomer(String name) {
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public abstract double calculateDiscount(double amount);

    @Override
    public double applyDiscount(double amount) {
        return amount - calculateDiscount(amount);
    }

}
