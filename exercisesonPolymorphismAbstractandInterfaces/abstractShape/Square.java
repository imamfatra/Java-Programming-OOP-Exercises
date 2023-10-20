package exercisesonPolymorphismAbstractandInterfaces.abstractShape;

public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {
        return super.getLength();
    }
    public String toString() {
        return "Square[" +
                super.toString()
                + ']';
    }
}

