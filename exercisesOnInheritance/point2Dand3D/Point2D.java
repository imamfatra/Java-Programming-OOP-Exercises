package exercisesOnInheritance.point2Dand3D;

public class Point2D {
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = {this.x, this.y};
        return xy;
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    private float x = 0.0f;
    private float y = 0.0f;

    @Override
    public String toString() {
        return "[" + this.x + "," + this.y + "]";
    }
}
