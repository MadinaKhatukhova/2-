public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int skillMagic, int transgression,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, skillMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.lustForPower = lustForPower;

    }

    @Override
    public String toString() {
        return super.toString() + " обладает хитростью " + cunning +
                ", решительностью " + determination +
                ", амбициозностью " + ambition +
                ", находчивостью " + resourcefulness +
                ", и жаждой власти " + lustForPower;
    }

    @Override
    public void compareStudents(Gryffindor student) {

    }

    @Override
    public void compareStudents(Hufflepuff student) {

    }

    @Override
    public void compareStudentRavenclaw(Ravenclaw student) {

    }


    @Override
    public void compareStudents(Slytherin student) {
        if (this.getCunning() + this.getAmbition() + this.getDeterminaton() + this.getLustForPower() +
                this.getResourcefulness() > student.getCunning() + student.getAmbition() + student.getDeterminaton() +
                student.getResourcefulness() + student.getLustForPower()) {
            System.out.println("Слизеринец " + this.getName() + " сильнее, чем " + student.getName());
        } else if (this.getCunning() < student.getCunning()) {
            System.out.println("Слизеринец " + student.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Слизеринец " + this.getName() + " равносилен " + student.getName());
        }
    }

    public int getCunning() { return  cunning; }

    public int getDeterminaton() { return  determination; }

    public int getAmbition() { return ambition; }

    public int getLustForPower() { return lustForPower; }

    public int getResourcefulness() { return resourcefulness; }

    public void compareStudentSlytherin(Slytherin daphne) {
    }
}
