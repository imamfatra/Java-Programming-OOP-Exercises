package exercisesonPolymorphismAbstractandInterfaces.movableInterface;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp1 = new MovablePoint(2, 4, -3, 4);
        System.out.println(mp1);
        mp1.moveDown();
        mp1.moveUp();
        mp1.moveLeft();
        mp1.moveRight();
        System.out.println(mp1);
        mp1.moveRight();
        mp1.moveDown();
        System.out.println(mp1);

    }
}
