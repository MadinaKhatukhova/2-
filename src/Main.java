//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gryffindor harryPoter = new Gryffindor( "Гарри Поттер", 89, 79, 13, 67, 66);
        Gryffindor hermioneGrander = new Gryffindor( "Гермиона Грейеджер", 31, 64, 35, 55, 55);
        Gryffindor ronWeasley = new Gryffindor( "Рон Уизли", 37, 55, 66, 12, 12);

        Ravenclaw zhouChang = new Ravenclaw( "Чжоу Чанг", 66, 33, 34, 45, 66, 86);
        Ravenclaw parvatiPatil = new Ravenclaw( "Парвати Патил", 66, 82, 12, 88, 33, 55);
        Ravenclaw marcusBelbi = new Ravenclaw( "Маркус Белби", 78, 46, 43, 49, 86, 45);

        Hufflepuff zachariahSmith = new Hufflepuff( "Захария смит", 36, 38, 35, 94, 26);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 49, 76, 37, 61, 67);
        Hufflepuff justinFletchley = new Hufflepuff("Джастин Финч-Флетчли", 94, 61, 62, 94, 65);

        Slytherin dracoMalfoy = new Slytherin( "Драко Малфой", 37, 38, 93, 68, 32, 55, 55);
        Slytherin grahamMontagu = new Slytherin( "Грехэм Монтегю", 55, 53, 86, 81, 34, 45, 22);
        Slytherin gregoryGoyle = new Slytherin( "Грегори Гойл", 41, 52, 83, 64, 38, 37, 44);

        System.out.println("harryPotter = " + harryPoter);
        System.out.println();

        System.out.println("dracoMalfoy = " + dracoMalfoy);
        System.out.println();

        parvatiPatil.compareStudentRavenclaw(zhouChang);
        System.out.println();

        hermioneGrander.compareStudents(gregoryGoyle);
        System.out.println();

        Slytherin draco = new Slytherin("Draco", 10, 100, 12, 12, 56, 56, 40);
        Slytherin daphne = new Slytherin("Daphne", 20, 1, 2, 6, 12, 56, 40);
        draco.compareStudentSlytherin(daphne);
        draco.compareStudents(daphne);

        Hufflepuff hufflepuff = new Hufflepuff("Cedric Diggory", 2, 4, 5, 6, 4);

        Hogwarts[] hogwartsStudents = new Hogwarts[]{harryPoter, draco, hermioneGrander};
        for (Hogwarts student : hogwartsStudents) {
            System.out.println(student.castSpell());

        }
    }
}