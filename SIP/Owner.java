package SIP;

public class Owner {
    private String ownerName;
    private Pet pet;

    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void adoptPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet(){
        return pet;
    }
}