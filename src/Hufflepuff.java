
public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int skillMagic, int transgression, int indusrtiousness, int loyalty, int honesty){
        super(name, skillMagic, transgression);
        this.industriousness = indusrtiousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Обладает трудолюбием " + industriousness +
                ", верностью " + loyalty +
                ", и честностью " + honesty;
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

    }

    public void compareStudent(Hufflepuff student) {
        if (this.getIndustriousness() + this.getHonesty() + this.getLoyalty() >
                student.getIndustriousness() + student.getHonesty() + student.getLoyalty()) {
            System.out.println("Пуффендуец " + this.getName() + " сильнее, чем " + this.getName());
        } else if (this.getIndustriousness() < student.getIndustriousness()) {
            System.out.println("Пуффендуец " + student.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Пуффендуйцы " + this.getName() + " равносильные " + student.getName());
        }
    }
    public int getIndustriousness() {return industriousness; }

    public int getLoyalty() {return loyalty; }

    public int getHonesty() {return honesty; }
}

