package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Plane {

    Point3D point;
    Vector vector;

    /********** Constructors ***********/

    public Plane(Point3D point, Vector vector) throws Exception {
        this.point = point;
        this.vector = vector.normalize();
    }

    /************** Getters/Setters *******/
    public Point3D getPoint() {
        return point;
    }

    public Vector getVector() {
        return vector;
    }

}

