public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int skillMagic, int transgression, int nobility, int honor, int bravery){
        super(name, skillMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", благороден на " + nobility +
                ", обладдает честностью " + honor +
                " и храбростью " + bravery;
    }
    public String castSell() { return "Avada kedabra!"; }


    @Override
    public void compareStudents(Gryffindor student) {
        if (this.getNobility() + this.getBravery() + this.getHonor() > student.getNobility() + student.getBravery() + student.getHonor()) {
            System.out.println("Гриффиндорец " + this.getName() + " сильнее, чем " + student.getName());
        } else if (this.getNobility() < student.getNobility()) {
            System.out.println("Гриффиндорец " + student.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Гриффендорцы " + this.getName() + " и " + student.getName() + " одинаково сильны");
        }
    }

    @Override
    public void compareStudents(Hufflepuff student) {
    }
    @Override
    public void compareStudentRavenclaw(Ravenclaw student) {
    }

    @Override
    public void compareStudents(Slytherin student) {

    }
}