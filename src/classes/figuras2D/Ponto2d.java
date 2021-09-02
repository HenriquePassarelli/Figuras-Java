package classes.figuras2D;


import classes.figuras2D.Objeto2d;

public class Ponto2d implements Objeto2d {
    private double x;
    private double y;

    public Ponto2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveX(double dX) {
        x+= dX;
    }

    @Override
    public void moveY(double dY) {
        y+= dY;
    }

    @Override
    public void moveXY(double dX, double dY) {
        x+= dX;
        y+= dY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Ponto2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

