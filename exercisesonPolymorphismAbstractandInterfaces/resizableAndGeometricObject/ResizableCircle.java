package exercisesonPolymorphismAbstractandInterfaces.resizableAndGeometricObject;

public class  ResizableCircle extends Circle implements Resizable {
    ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(int percent) {
        double radius = super.getRadius();
        radius *= percent/100.0;
        super.setRadius(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}
