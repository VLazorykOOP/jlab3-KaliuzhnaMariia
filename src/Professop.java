public class Professop extends Person {
    int experience;

    public Professop(String name, String surname, int ID, int experience) {
        super(name, surname, ID);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Professop: " +
                super.toString() + '\'' +
                "experience=" + experience + '\'';
    }
}
