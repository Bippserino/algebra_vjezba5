public class Dog extends Animal{
    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String live() {
        return "Dog is living";
    }

    @Override
    public String eat() {
        return "Dog is eating";
    }

    @Override
    public String move() {
        return "Dog is running";
    }
}
