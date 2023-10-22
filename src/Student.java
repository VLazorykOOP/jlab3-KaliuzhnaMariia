public class Student extends Person {
    int yearOfStudy;
    int groupNumber;

    public Student(String name, String surname, int ID, int yearOfStudy, int groupNumber) {
        super(name, surname, ID);
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
