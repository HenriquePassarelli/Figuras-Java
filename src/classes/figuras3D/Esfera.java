package classes.figuras3D;

public class Esfera implements Figura3D{
    public Ponto3D centro;
    public double raio;

    public Esfera(Ponto3D centro, double raio) {
        this.centro = new Ponto3D(centro.getX(), centro.getY(), centro.getZ());//centro;
        this.raio = raio;
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
        centro.moveXY(dX,dY);
    }

    @Override
    public double calcVolume() {
        return (4*Math.PI*raio*raio*raio)/3;
    }

    @Override
    public void moveZ(double dZ) {
        centro.moveZ(dZ);
    }

    @Override
    public void moveXZ(double dZ, double dX) {
        centro.moveXZ(dZ,dX);
    }

    @Override
    public void moveYZ(double dZ, double dY) {
        centro.moveYZ(dZ,dY);
    }

    public Ponto3D getCentro() {
        return centro;
    }

    public void setCentro(Ponto3D centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public String toString() {
        return "Esfera{" +
                "centro=" + centro +
                ", raio=" + raio +
                ", volume = "+ calcVolume()+
                '}';
    }
}
