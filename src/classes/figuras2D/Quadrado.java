package classes.figuras2D;

import classes.figuras2D.Figura2d;
import classes.figuras2D.Ponto2d;

public class Quadrado implements Figura2d {
    private Ponto2d p0;
    private double lado;


    public Quadrado(Ponto2d p0, double lado) {
        this.p0 = new Ponto2d(p0.getX(),p0.getY());
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return lado*lado;
    }

    @Override
    public double calcPerimetro() {
        return lado*4;
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX, dY);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Ponto2d calcP1(){
        return new Ponto2d(p0.getX()+lado, p0.getY() ); // ponto a direita de p0
    }

    public Ponto2d calcP2(){
        return new Ponto2d(p0.getX(), p0.getY()+lado); // ponto em cima de p0
    }

    public Ponto2d calcP3(){
        return new Ponto2d(p0.getX()+lado, p0.getY()+lado); // ponto
    }

    public Ponto2d getP0() {
        return p0;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "p0 =" + p0 + ", p1 ="+ calcP1() + ", p2 ="+calcP2()+ "p3 ="+ calcP3()+  ", lado =" + lado + ", area =" + calcArea()+ ", perimetro = " + calcPerimetro() +  '}';
    }
}
