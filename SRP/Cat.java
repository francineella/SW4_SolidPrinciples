package SRP;

public class Cat implements Pet {
    private String petName;

    public Cat(String petName){
        this.petName = petName;
    }
    @Override
    public String getPetName() {
        return petName;
    }

    @Override
    public String makeSound() {
        return petName + " said meow.";
    }
    @Override
    public String eat() {
        return petName + " ate catfood.";
    }
}