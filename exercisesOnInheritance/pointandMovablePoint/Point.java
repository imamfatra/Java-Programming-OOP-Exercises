package exercisesOnInheritance.pointandMovablePoint;

public class Point {
    Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
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

    private float x = 0.0f;
    private float y = 0.0f;

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = {this.x, this.y};
        return xy;
    }

    @Override
    public String toString() {
        return "[" + x + ',' + y + ']';
    }
}
