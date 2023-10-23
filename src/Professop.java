public class Professop extends Person {
    int experience;

    public Professop(String name, String surname, int id, int experience) {
        super(name, surname, id);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Professop: " +
                super.toString() + '\'' +
                "experience=" + experience + '\'';
    }
}
