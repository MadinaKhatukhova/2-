public abstract class Hogwarts {

    private final int magicPower;
    private final int transgression;
    private final String name;

    public Hogwarts(String name, int magicPower, int transgression){
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Студент " + name +
                " обладает силой магии " + magicPower +
                " и может трансгрессировать на расстояние " + transgression;
    }

    public String getName() {
        return name;}

    public int getMagicPower() {
        return magicPower;}

    public int getTransgression() {
        return transgression; }

    public void compareStudents(Hogwarts student){
        if (this.getMagicPower() + this.getTransgression() > student.getMagicPower() + student.getTransgression()) {
            System.out.println(
                    "Студент Хогвартса " + this.getName() + " обладает большей силой , чем " + student.getName());

        } else if (this.getMagicPower() + this.getTransgression() ==
                student.getMagicPower() + student.getTransgression()) {
            System.out.println("Сила студента Хогвартса " + this.getName() +
                    " равна силе студента " + student.getName());
        } else {
            System.out.println(
                    "Студент Хогвартса " + student.getName() + " обладает большей силой , чем " + this.getName());

                    }
    }

    public abstract void compareStudents(Gryffindor student);

    public abstract void compareStudents(Hufflepuff student);

    public abstract void compareStudentRavenclaw(Ravenclaw student);

    public abstract void compareStudents(Slytherin student);

    public boolean castSpell() {
        return false;
    }
}
