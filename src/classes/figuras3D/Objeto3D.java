package classes.figuras3D;

import classes.figuras2D.Objeto2d;

public interface Objeto3D extends Objeto2d {
    void moveZ(double dZ);
    void moveXZ(double dZ,double dX);
    void moveYZ(double dZ, double dY);
}
