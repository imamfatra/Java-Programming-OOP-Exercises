package exercisesonPolymorphismAbstractandInterfaces.abstractShape;

public class Circle extends Shape {
    private double radius = 0.1;
    final double PI = Math.PI;

    Circle() {
        this.radius = 0.1;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * PI;
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                super.toString() +
                ",radius=" + this.radius +
                ']';
    }
}

