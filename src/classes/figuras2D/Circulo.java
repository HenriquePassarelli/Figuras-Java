package classes.figuras2D;

public class Circulo implements Figura2d {
    private Ponto2d centro;
    private double raio;

    public Circulo(Ponto2d centro, double raio) {
        this.centro = new Ponto2d(centro.getX(), centro.getY()); // centro
        this.raio = raio;
    }

    public Ponto2d getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcArea() {
        return (Math.PI)*(raio*raio);
    }

    @Override
    public double calcPerimetro() {
        return 2*(Math.PI)*raio;
    }

    @Override
    public void moveX(double dX) {
        centro.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        centro.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        centro.moveXY(dX, dY);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", raio=" + raio +
                ", area = " + calcArea() +
                ", perimetro = " + calcPerimetro() +

                '}';
    }
}
