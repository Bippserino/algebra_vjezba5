import java.util.ArrayList;

public class Professor extends Person{
    private String faculty;
    private String course;

    public Professor(String OIB, String name, String surname, Address address, ArrayList<Animal> pets,
                     String faculty, String course) {

        super(OIB, name, surname, address, pets);
        this.faculty = faculty;
        this.course = course;
    }

    public String teach() {
        return String.format("Professor is teaching %s at %s", this.course, this.faculty);
    }

    @Override
    public String live() {
        return "Professor is living";
    }

    @Override
    public String eat() {
        return "Professor is eating";
    }

    @Override
    public String sleep() {
        return "Professor is sleeping";
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
