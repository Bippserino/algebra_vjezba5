 import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("12345678910", "John", "Doe",
                new Address("Croatia", "Osijek", "31000", "VIM",
                        "102"), new ArrayList<Animal>(), "FERIT", "OE 1");

        Student student = new Student("12345678910", "Jane", "Doe",
                new Address("Croatia", "Osijek", "31000", "VIM",
                        "105"), new ArrayList<Animal>(), "2345674534",
                "FERIT", 3);

        Dog dog = new Dog("Rex", 50);
        Fish fish = new Fish("Flipper", 1);
        Bird bird = new Bird("Tweety", 2);

        System.out.println(professor.live() + "\n" + professor.eat() + "\n" + professor.sleep() + "\n" + professor.teach());
        System.out.println(student.live() + "\n" + student.eat() + "\n" + student.sleep() + "\n" + student.study());
        System.out.println(dog.move());
        System.out.println(fish.move());
        System.out.println(bird.move());

        professor.addPet(dog);
        student.addPet(fish);
    }

}