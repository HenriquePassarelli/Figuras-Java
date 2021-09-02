package classes.figuras3D;

public class Ponto3D implements Objeto3D{
    private double x;
    private double y;
    private double z;

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void moveX(double dX) {
        x+=dX;
    }

    @Override
    public void moveY(double dY) {
        x+=dY;
    }

    @Override
    public void moveXY(double dX, double dY) {
        x+=dX;
        y+=dY;
    }

    @Override
    public void moveZ(double dZ) {
        x+=dZ;
    }

    @Override
    public void moveXZ(double dZ, double dX) {
        z+=dZ;
        x+=dX;
    }

    @Override
    public void moveYZ(double dZ, double dY) {
        z+=dZ;
        y+=dY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Ponto3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
