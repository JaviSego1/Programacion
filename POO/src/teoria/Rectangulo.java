package teoria;

import static java.lang.Math.hypot;

public class Rectangulo {

    private int alto;
    private int ancho;



    public int getAlto() {
        return alto;
    }
    public void setAlto(int altura) {
        this.alto = altura;
    }

    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }




    //tres metodos: calculo del area, calculo del perimetro y calculo de la diagonal
    public int getArea() {
        return (alto * ancho);
    }

    public int getPerimetro() {
        return ((2 * alto) * (2 * ancho));
    }

    public double getDiagonal() {
        return hypot(alto, ancho);
    }

    @Override
    public String toString() {

        return "RECTÁNGULO: alto " + alto + ", ancho: " + ancho;
    }



}
