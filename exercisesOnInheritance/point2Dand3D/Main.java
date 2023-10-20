package exercisesOnInheritance.point2Dand3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(2.4f);
        point2D.setY(2.9f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D();
        point3D.setZ(8.0f);
        point3D.setX(point2D.getX());
        point3D.setY(point2D.getY());
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(1.0f, 1.9f, 92f);
        System.out.println(point3D1);
        System.out.println(Arrays.toString(point3D1.getXY()));
    }
}
