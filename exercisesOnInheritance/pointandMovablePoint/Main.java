package exercisesOnInheritance.pointandMovablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3f, 6f, 2f, 4f);
        System.out.println(movablePoint.toString());

        movablePoint.move();
        System.out.println(movablePoint.toString());

    }
}
