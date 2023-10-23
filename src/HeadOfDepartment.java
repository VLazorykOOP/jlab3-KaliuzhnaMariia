public class HeadOfDepartment extends Professop {
    String department;

    public HeadOfDepartment(String name, String surname, int id, int experience, String department) {
        super(name, surname, id, experience);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Head Of Department: " +
                super.toString()  +
                ", department='" + department + '\'';
    }
}
