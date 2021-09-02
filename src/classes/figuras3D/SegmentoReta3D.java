package classes.figuras3D;

public class SegmentoReta3D implements Objeto3D {
    private Ponto3D p0;
    private Ponto3D p1;

    public SegmentoReta3D(Ponto3D p0, Ponto3D p1) {
        this.p0 = new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
        this.p1 = new Ponto3D(p1.getX(), p1.getY(), p1.getZ());
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
        p1.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
        p1.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX,dY);
        p1.moveXY(dX,dY);
    }

    @Override
    public void moveZ(double dZ) {
        p0.moveZ(dZ);
        p1.moveZ(dZ);
    }

    @Override
    public void moveXZ(double dZ, double dX) {
        p0.moveXZ(dZ,dX);
        p1.moveXZ(dZ,dX);
    }

    @Override
    public void moveYZ(double dZ, double dY) {
        p0.moveYZ(dZ,dY);
    }

    public Ponto3D getP0() {
        return p0;
    }

    public void setP0(Ponto3D p0) {
        this.p0 = p0;
    }

    public Ponto3D getP1() {
        return p1;
    }

    public void setP1(Ponto3D p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "SegmentoReta3D{" +
                "p0=" + p0 +
                ", p1=" + p1 +
                '}';
    }
}
