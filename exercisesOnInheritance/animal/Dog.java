package exercisesOnInheritance.animal;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog a) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog["+ super.toString() + "]";
    }
}
