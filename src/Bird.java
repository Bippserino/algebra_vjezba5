public class Bird extends Animal{
    public Bird(String name, int weight) {
        super(name,weight);
    }
    @Override
    public String live() {
        return "Bird is living";
    }

    @Override
    public String eat() {
        return "Bird is eating";
    }

    @Override
    public String move() {
        return "Bird is flying";
    }
}
