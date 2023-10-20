package exercisesOnClass.circle;

public class Circle {
    private double radius = 1.0;
    final private double pi = Math.PI;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(){
        radius = this.getRadius();
    }

    Circle(double r) {
        radius = r;
    }

    public double getArea() {
        double luas = pi * getRadius() * getRadius();
        return luas;
    }

    public double getCircumFerence() {
        double k = 2 * pi * getRadius();
        return k;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(3.2);
        System.out.println(c1);

        // default constructor
        Circle c2 = new Circle();
        System.out.println(c2);

        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.printf("area is %.2f\n", c1.getRadius());

        System.out.printf("area is: %.2f\n", c1.getArea());
        System.out.printf("circumfernce: %.2f", c1.getCircumFerence());
    }
}
