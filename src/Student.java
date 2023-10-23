public class Student extends Person {
    int yearOfStudy;
    int groupNumber;

    public Student(String name, String surname, int id, int yearOfStudy, int groupNumber) {
        super(name, surname, id);
        this.yearOfStudy = yearOfStudy;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student: " +
                super.toString() + '\'' +
                "yearOfStudy=" + yearOfStudy + '\'' +
                ", groupNumber=" + groupNumber + '\'';
    }
}
