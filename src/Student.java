import java.util.ArrayList;

public class Student extends Person{
    private String JMBAG;
    private String faculty;
    private int yearOfStudy;

    public Student(String OIB, String name, String surname, Address address, ArrayList<Animal> pets,
                   String JMBAG, String faculty, int yearOfStudy) {

        super(OIB, name, surname, address, pets);
        this.JMBAG = JMBAG;
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
    }

    public String study() {
        return "Student is studying";
    }

    @Override
    public String live() {
        return "Student is living";
    }

    @Override
    public String eat() {
        return "Student is eating";
    }

    @Override
    public String sleep() {
        return "Student is sleeping for 10 hours";
    }

    public String getJMBAG() {
        return JMBAG;
    }

    public void setJMBAG(String JMBAG) {
        this.JMBAG = JMBAG;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
