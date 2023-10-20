package exercisesOnInheritance.point2Dand3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D() {
        super();
        this.z = 0.0f;
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz= {getX(), getY(), this.z};
        return xyz;
    }

    @Override
    public String toString() {
        return "[" + getX() + "," +
                getY() + "," + this.z +
                ']';
    }
}
