package classes.figuras2D;

import classes.figuras2D.Figura2d;
import classes.figuras2D.Ponto2d;

public class Retangulo implements Figura2d {
    private Ponto2d p0;
    private double base ;
    private double altura;

    public Retangulo(Ponto2d p0, double base, double altura) {
        this.p0 = new Ponto2d(p0.getX(), p0.getY()); // p0
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return base*altura;
    }

    @Override
    public double calcPerimetro() {
        return (2*base)+(2*altura);
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
        p0.moveXY(dX,dY);
    }

    public Ponto2d getP0() {
        return p0;
    }
    public Ponto2d calcP1(){
        return new Ponto2d(p0.getX()+base, p0.getY() ); // ponto a direita de p0
    }

    public Ponto2d calcP2(){
        return new Ponto2d(p0.getX(), p0.getY()+altura); // ponto em cima de p0
    }

    public Ponto2d calcP3() {
        return new Ponto2d(p0.getX() + base, p0.getY() + altura); // ponto
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "p0 = " + p0 +
                ", p1 = "+ this.calcP1() +
                ", p2 = "+this.calcP2()+
                "p3 = "+ this.calcP3()+
                ", base = " + base +
                ", altura = "+ altura +
                ", area = " + this.calcArea()+
                ", perimetro = " + this.calcPerimetro()
                +  '}';

    }
}
