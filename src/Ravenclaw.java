public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int skillMagic, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, skillMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() + ", Обладает умом " + mind +
                ", мудростью " + wisdom +
                ", остроумием " + wit +
                ", и творчеством " + creation;
    }

    @Override
    public void compareStudents(Gryffindor student) {

    }

    @Override
    public void compareStudents(Hufflepuff student) {
    }


    @Override
    public void compareStudentRavenclaw(Ravenclaw student) {
        if (this.getMind() + this.getCreation() + this.getWit() + this.getWisdom() >
                student.getMind() + student.getCreation() + student.getWit() + student.getWisdom()) {
            System.out.println("Когтевранец " + this.getName() + " сильнее , чем " + student.getName());

        } else if (this.getMind() < student.getMind()) {
            System.out.println("Когтевранец " + student.getName() +
                    " сильнее, чем " + this.getName());
        } else {
            System.out.println("Когтевранец " + this.getName() + " равносильный " + student.getName());

        }
    }

    @Override
    public void compareStudents(Slytherin student) {

    }

    private int getCreation() {
        return 0;
    }

    private int getWit() {
        return 0;
    }

    private int getWisdom() {
        return 0;
    }

    public int getMind() {
        return mind;
    }
}

