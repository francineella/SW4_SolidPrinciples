package SIP;

public class Main {
    public static void main(String[] args) {
        
        Owner owner1 = new Owner("Lala");
        Pet pet1 = new Cat("Runner");
        Pet pet2 = new Dog("Top");

        owner1.adoptPet(pet1);

        System.out.println(owner1.getOwnerName() + " has a pet named " + owner1.getPet().getPetName());
        System.out.println(owner1.getPet().makeSound());
        System.out.println(owner1.getPet().eat() + "\n");

        owner1.adoptPet(pet2);
        System.out.println(owner1.getOwnerName() + " has a pet named " + owner1.getPet().getPetName());
        System.out.println(owner1.getPet().makeSound());
        System.out.println(owner1.getPet().eat() + "\n");

    }
}