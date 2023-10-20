package exercisesonPolymorphismAbstractandInterfaces.geometricObjectInterface;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(12);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1);

        Rectangle r1 = new Rectangle(4, 12);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1);
    }
}
