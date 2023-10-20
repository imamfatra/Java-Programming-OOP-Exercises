package exercisesOnInheritance.personAndIts;

public class Main {
    public static void main(String[] args) {
        var joko = new Person("Joko", "Surakarta");
        System.out.println(joko);

        var anak1 = new Student("Dimas", "lesung Batu", "Sastra Indonesia", 2022, 1500000000);
        System.out.println(anak1.getProgram());
        System.out.println(anak1);

        var staff1 = new Staff("Agus", "Jakarta", "Smansu", 1900000);
        System.out.println(staff1);
    }
}
