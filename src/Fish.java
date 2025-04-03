public class Fish extends Animal{
    public Fish(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String live() {
        return "Fish is living";
    }

    @Override
    public String eat() {
        return "Fish is eating";
    }

    @Override
    public String move() {
        return "Fish is swimming";
    }
}
