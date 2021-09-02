package figuraGeometrica;

import classes.figuras2D.*;
import classes.figuras3D.*;


public class figuraGeometrica {

    public static void main(String[ ]args){

        /*Ponto2d p0 = new Ponto2d(1.5,1.5);
        Ponto2d p1 = new Ponto2d(3,2);
        Ponto2d p2 = new Ponto2d(2,0);
        Ponto2d p3 = new Ponto2d(1,0);
        Ponto2d p4 = new Ponto2d(4,0);

        SegmentoReta sr0 = new SegmentoReta(p0,p1);
        System.out.println(sr0);

        Quadrado q0 = new Quadrado(p0,3);
        System.out.println(q0);

        Retangulo r0 = new Retangulo(p1,3,4);
        System.out.println(r0);

        Circulo c0 = new Circulo(p2,5);
        System.out.println(c0);

        Triangulo t1 = new Triangulo(new Ponto2d(1,0),new Ponto2d(2,2),new Ponto2d(0,3));

        System.out.println(t1);*/

        Ponto3D p0 = new Ponto3D(2,2,2);
        Ponto3D p1 = new Ponto3D(5,0,4);

        System.out.println(p0);

        SegmentoReta3D s0 = new SegmentoReta3D(p0,p1);
        System.out.println(s0);

        Cubo c0 = new Cubo(p0,2);
        System.out.println(c0);

        Esfera e0 = new Esfera(p0,2);
        System.out.println(e0);

        Paralelepipedo pa0 = new Paralelepipedo(p0,2,2,2);
        System.out.println(pa0);


    }
}
