package exercisesOnInheritance.shapeCircleRectangleSquare;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("yellow", false);
        System.out.println(shape);
        Shape shape1 = new Shape();
        shape1.setColor("blue");
        System.out.println(shape1);

        Circle circle = new Circle(93.0, shape.getColor(), shape.isFilled());
        System.out.println(circle);
        System.out.printf("%.2f\n",circle.getArea());
        System.out.printf("%.2f\n",circle.getPerimeter());

        Rectangle rectangle = new Rectangle(8, 12);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(7, "grey", true);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
