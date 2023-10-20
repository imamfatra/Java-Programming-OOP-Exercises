package exercisesOnInheritance.circleAndCylinder;

public class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double radius = 1.0;
    private String color = "red";
    final private  double pi = Math.PI;

    Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public String toString() {
        String s = String.format("Circle[radius=%.2f,color=%s]", radius, color);
        return s;
    }

}
