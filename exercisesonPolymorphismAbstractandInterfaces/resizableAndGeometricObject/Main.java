package exercisesonPolymorphismAbstractandInterfaces.resizableAndGeometricObject;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(25);
        System.out.println(c1.getParameter());
        System.out.println(c1.getArea());
        System.out.println(c1);
        System.out.println("radius: " + c1.getRadius());
        System.out.println("");

        ResizableCircle c2 = new ResizableCircle(25);
        System.out.println(c2.getParameter());
        System.out.println(c2.getArea());
        System.out.println(c2);
        System.out.println("radius: " + c2.getRadius());
        c2.resize(20);
        System.out.println(c2.getParameter());
        System.out.println(c2.getArea());
        System.out.println(c2);
        System.out.println("radius: " + c2.getRadius());
    }
}
