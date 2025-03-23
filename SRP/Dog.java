package SRP;

public class Dog implements Pet {
    private String petName;

    public Dog(String petName) {
        this.petName = petName;
    }
    @Override
    public String getPetName() {
        return petName;
    }
    @Override
    public String makeSound() {
        return petName + " barked. Arf arf!";
    }
    @Override
    public String eat() {
        return petName + " ate dogfood.";
    }
}