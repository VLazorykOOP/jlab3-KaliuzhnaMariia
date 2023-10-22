public class HeadOfDepartment extends Persona {
    int experience;
    String department;

    public HeadOfDepartment(String name, String surname, int ID, int experience, String department) {
        super(name, surname, ID);
        this.experience = experience;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Head Of Department: " +
                super.toString() + '\'' +
                "experience=" + experience + '\'' +
                ", department='" + department + '\'';
    }
}
