package exercisesonPolymorphismAbstractandInterfaces.geometricObjectInterface;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius * Math.PI * 2;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + this.radius +
                ']';
    }
}
