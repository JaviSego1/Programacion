package ejercicios.ejercicio2;

import static java.lang.Math.hypot;

public class TrianguloRectangulo {
    private int cateto1;
    private int cateto2;


    public int getCateto1() {
        return cateto1;
    }
    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public int getCateto2() {
        return cateto2;
    }
    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }

    //tres metodos: calculo de la area, calculo del perimetro y la hipotenusa

    public double calcularHipotenusa () {
        return hypot(cateto1, cateto2);
    }

    public double calcularArea () {
        return cateto1 * cateto2 / 2.0;
    }

    public double calcularPerimetro () {
        return cateto1 + cateto2 + calcularHipotenusa();
    }

    @Override
    public String toString() {
        return String.format("TRIANGULO RECTANGULO: cateto %d, cateto %d, " +
                "hipotenusa %.2f, perimetro %.2f y area %.2f%n", cateto1, cateto2,
                calcularHipotenusa(), calcularPerimetro(), calcularArea());
    }
}
