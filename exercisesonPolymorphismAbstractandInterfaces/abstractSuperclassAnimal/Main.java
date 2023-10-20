package exercisesonPolymorphismAbstractandInterfaces.abstractSuperclassAnimal;

public class Main {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("Sam");
        cat1.greets();
        Dog dog1 = new Dog("dog1");
        dog1.greets();
        BigDog bigDog1 = new BigDog("bigDog1");
        bigDog1.greets();

        // Using Polymorphism
        System.out.println("");
        Animal animal1 = new Cat("cat2");
        animal1.greets();
        Animal animal2 = new Dog("dog2");
        animal2.greets();
        Animal animal3 = new BigDog("bogDog2");
        animal3.greets();
//        Animal animal4 = new Animal("animal"); ERROR because class abstract

        // Downcast
        System.out.println("");

        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
//        Cat cat2 = (Cat)animal2; ERROR because animal2 not object from Cat
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
