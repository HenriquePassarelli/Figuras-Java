package classes.figuras3D;

public class Paralelepipedo implements Figura3D{
    private Ponto3D p0;
    private double base;
    private double altura;
    private  double profundidade;

    public Paralelepipedo(Ponto3D p0, double base, double altura, double profundidade) {
        this.p0 = new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
        this.base = base;
        this.altura = altura;
        this.profundidade = profundidade;
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

    @Override
    public double calcVolume() {
        return base*altura*profundidade;
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
        p0.moveYZ(dZ,dY);
    }

    public Ponto3D calcP1(){
        return new Ponto3D(p0.getX()+base, p0.getY(),p0.getZ());
    }

    public Ponto3D calcP2(){
        return new Ponto3D(p0.getX(), p0.getY()+altura,p0.getZ());
    }

    public Ponto3D calcP3(){
        return new Ponto3D(p0.getX()+base, p0.getY()+altura,p0.getZ());
    }

    public Ponto3D calcP4(){
        return new Ponto3D(p0.getX()+base, p0.getY(),p0.getZ()+profundidade);
    }

    public Ponto3D calcP5(){
        return new Ponto3D(p0.getX(), p0.getY()+altura,p0.getZ()+profundidade);
    }

    public Ponto3D calcP6(){
        return new Ponto3D(p0.getX()+base, p0.getY()+altura,p0.getZ()+profundidade);
    }

    public Ponto3D getP0() {
        return p0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Paralelepipedo{" +
                "p0=" + p0 +
                ", p1 = " + calcP1()+
                ", p2 = " + calcP2()+
                ", p3 = " + calcP3()+"\n"+
                ", p4 = " + calcP4()+ "\n"+
                ", base=" + base +
                ", altura=" + altura +
                ", profundidade=" + profundidade +
                ", volume = " + calcVolume() +
                '}';
    }
}
