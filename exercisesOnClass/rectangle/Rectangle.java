package exercisesOnClass.rectangle;

public class Rectangle {
    float length = 1.0f;
    float width = 1.0f;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    Rectangle() {
        width = getWidth();
        length = getLength();
    }

    Rectangle(float l, float w) {
        setWidth(w);
        setLength(l);
    }

    public double getArea() {
        double l = getWidth() * getLength();
        return l;
    }

    public double getPerimeter() {
        double k = 2 * (getWidth() + getLength());
        return k;
    }

    public String toString() {
        return "Rectangle[length=" + getLength() + ",width=" + getWidth() + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);  // toString()
        Rectangle r2 = new Rectangle();  // default constructor
        System.out.println(r2);

        // Test setters and getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);  // toString()
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}