package exercisesOnInheritance.pointandMovablePoint;

public class MovablePoint extends Point{
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] xy = {this.xSpeed, this.ySpeed};
        return  xy;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                "speed=(" + xSpeed + "," + ySpeed + ')';
    }

    public MovablePoint move() {
        float x = super.getX();
        float y = super.getY();
        super.setX(x + getxSpeed());
        super.setY(y + getySpeed());
        return this;
    }
}
