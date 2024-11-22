public class Hufflepuff extends Hogwarts {

    private int industriosness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int skillMagic, int transgression, int indusrtiousness, int loyalty, int honesty){
        super(name, skillMagic, transgression);
        this.industriosness = indusrtiousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    @Override
    public String toString() {
        return super.toString() + "Обладает трудолюбием " + industriosness +
                ", верностью " + loyalty +
                ", и честностью " + honesty;
    }

    @Override
    public void compareStudents(Hufflepuff student) {
        if (this.getIndustriosness() + this.getHonesty() + this.getLoyalty() >
                student.getIndustriosness() + student.getHonesty() + student.getLoyalty()) {
            System.out.println("Пуффендуец " + this.getName() + " сильнее, чем " + this.getName());
        } else if (this.getIndusrtiousness() < student.getIndusrtiousness()) {
            System.out.println("Пуффендуец " + student.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Пуффендуйцы " + this.getName() + " равносильные " + student.getName());
        }
    }

    public String castSpell() {return "Bombarda!" }

    public int getIndustriosness() {return industriosness; }

    public int getLoyalty() {return loyalty; }

    public int getHonesty() {return honesty; }
    }
}
