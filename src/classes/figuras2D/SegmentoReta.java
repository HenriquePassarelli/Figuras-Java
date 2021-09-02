package classes.figuras2D;

public class SegmentoReta implements Objeto2d {
    private Ponto2d p0;
    private Ponto2d p1;

    public SegmentoReta(Ponto2d p0, Ponto2d p1) {
        this.p0 = new Ponto2d(p0.getX(), p0.getY()); //p0
        this.p1 = new Ponto2d(p1.getX(), p1.getY()); //p1
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
        this.moveX(dX);
        this.moveY(dY);
    }

    public Ponto2d getP0() {
        return p0;
    }

    public Ponto2d getP1() {
        return p1;
    }

    public double comprimento(){
        //d= raiz quadrada de ((x2-x1)^2+(y2-y1)^2)
        return (float)Math.sqrt(Math.pow(p1.getX()-p0.getX(),2)
                + Math.pow(p1.getY()-p0.getY(),2));
    }
    @Override
    public String toString() {
        return "SegmentoReta{" +
                "p0=" + p0 +
                ", p1=" + p1 + ", comprimento = "+ comprimento() +
                '}';
    }
}
