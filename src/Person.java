import java.util.ArrayList;

public abstract class Person {
    private String OIB;
    private String name;
    private String surname;
    private Address address;
    private ArrayList<Animal> pets;

    public Person(String OIB, String name, String surname, Address address, ArrayList<Animal> pets) {
        this.OIB = OIB;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.pets = pets;
    }

    public abstract String live();
    public abstract String eat();
    public abstract String sleep();

    public void addPet(Animal pet) {
        this.pets.add(pet);
    }
}
