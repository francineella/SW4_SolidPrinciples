package OCP;

public class Student extends AbstractCustomer{
    public Student (String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}
