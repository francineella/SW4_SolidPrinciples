package OCP;

public class Main {
    public static void main(String[] args) {
        Customer student = new Student ("Francheska");
        Customer regular = new Regular ("Marco");
        Customer senior = new SeniorCitizen ("Estela");

        double purchaseAmount = 500.00;

        System.out.println(student.getName() + " has a purchase amounting P" + purchaseAmount + "\nDiscount: P" + student.calculateDiscount(purchaseAmount) +
        "\nAmount to pay: P" + student.applyDiscount(purchaseAmount)  + "\n");
        System.out.println(regular.getName() + " has a purchase amounting P" + purchaseAmount + "\nDiscount: P" + regular.calculateDiscount(purchaseAmount) +
        "\nAmount to pay: P" + regular.applyDiscount(purchaseAmount)  + "\n");
        System.out.println(senior.getName() + " has a purchase amounting P" + purchaseAmount + "\nDiscount: P" + senior.calculateDiscount(purchaseAmount) +
        "\nAmount to pay: P" + senior.applyDiscount(purchaseAmount));
    }
}
