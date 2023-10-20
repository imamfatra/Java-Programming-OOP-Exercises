package exercisesOnInheritance.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Bird");
        System.out.println(animal);
        System.out.println(animal.getName().toString());

        Mammal mammal = new Mammal("Bull");
        System.out.println(mammal);

        Cat cat = new Cat("prass");
        System.out.println(cat);
        cat.greets();

        Dog dog = new Dog("gukguk");
        Dog dog1 = new Dog("stepp");
        System.out.println(dog);
        dog.greets();
        dog.greets(dog1);
    }
}
