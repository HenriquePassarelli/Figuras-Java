package classes.figuras2D;

import classes.figuras3D.Figura3D;
import classes.figuras3D.Ponto3D;

public class Cubo implements Figura3D {
    private Ponto3D p0;
    private double lado;

    public Cubo(Ponto3D p0, double lado) {
        this.p0 = new Ponto3D(p0.getX(), p0.getY(), p0.getZ());//p0;
        this.lado = lado;
    }

    @Override
    public double calcVolume() {
        return lado*lado*lado;
    }

    @Override
    public void moveZ(double dZ) {
        p0.moveZ(dZ);
    }

    @Override
    public void moveXZ(double dZ, double dX) {
        p0.moveXZ(dZ,dX);
    }

    @Override
    public void moveYZ(double dZ, double dY) {
        p0.moveXY(dY,dY);
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

    public Ponto3D calcP1(){
        return new Ponto3D(p0.getX()+lado, p0.getY(),p0.getZ());
    }

    public Ponto3D calcP2(){
        return new Ponto3D(p0.getX(), p0.getY()+lado,p0.getZ());
    }

    public Ponto3D calcP3(){
        return new Ponto3D(p0.getX()+lado, p0.getY()+lado,p0.getZ());
    }

    public Ponto3D calcP4(){
        return new Ponto3D(p0.getX(), p0.getY(),p0.getZ()+lado);
    }

    public Ponto3D calcP5(){
        return new Ponto3D(p0.getX()+lado, p0.getY(),p0.getZ()+lado);
    }

    public Ponto3D calcP6(){
        return new Ponto3D(p0.getX()+lado, p0.getY()+lado,p0.getZ()+lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "p0=" + p0 +
                ", p1 = "+ calcP1() +
                ", p2 = "+ calcP2() +
                ", p3 = "+ calcP3() +
                ", P4 = "+ calcP4() +
                ", p5 = "+ calcP5() +
                ", p6 = "+ calcP6() +
                ", lado=" + lado +
                ", volume = "+calcVolume()+
                '}';
    }
}
