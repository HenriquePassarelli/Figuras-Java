package classes.figuras2D;

public class Triangulo implements Figura2d {
    private Ponto2d p0;
    private Ponto2d p1;
    private Ponto2d p2;

    public Triangulo(Ponto2d p0, Ponto2d p1, Ponto2d p2) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double calcArea() {
        SegmentoReta segA = new SegmentoReta(p0, p1);
        double a = segA.comprimento();//a=comprimento de P0->P1
        SegmentoReta segB = new SegmentoReta(p1, p2);
        double b = segB.comprimento();//b=comprimento de P1->P2
        SegmentoReta segC = new SegmentoReta(p2, p0);
        double c = segC.comprimento();//c=comprimento de P2->P0
        double p = (a+b+c)/2;//p=(a+b+c)/2
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));//A=raiz_quadrada(p*(p-a)*(p-b)*(p-c))
    }

    @Override
    public double calcPerimetro() {
        SegmentoReta segA = new SegmentoReta(p0, p1);
        double a = segA.comprimento();//a=comprimento de P0->P1
        SegmentoReta segB = new SegmentoReta(p1, p2);
        double b = segB.comprimento();//b=comprimento de P1->P2
        SegmentoReta segC = new SegmentoReta(p2, p0);
        double c = segC.comprimento();//c=comprimento de P2->P0
        return a+b+c;//P=a+b=c
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
        p1.moveX(dX);
        p2.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
        p1.moveY(dY);
        p2.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX,dY);
        p1.moveXY(dX,dY);
        p2.moveXY(dX,dY);
    }

    public Ponto2d getP0() {
        return p0;
    }

    public Ponto2d getP1() {
        return p1;
    }

    public Ponto2d getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "p0=" + p0 +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", area = " + calcArea()+
                ", perimetro = " + calcPerimetro()
                +
                '}';
    }
}
