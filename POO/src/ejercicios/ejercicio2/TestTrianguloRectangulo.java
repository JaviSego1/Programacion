package ejercicios.ejercicio2;

public class TestTrianguloRectangulo {
    public static void main(String[] args) {
        TrianguloRectangulo tRectangulo1 = new TrianguloRectangulo(); //Creando un triangulo rectangulo
        tRectangulo1.setCateto1(3);
        tRectangulo1.setCateto2(5);
        System.out.printf("Cateto 1: %d%n", tRectangulo1.getCateto1());
        System.out.printf("Cateto 2: %d%n",tRectangulo1.getCateto2());
        System.out.printf("Hipotenusa: %.2f%n", tRectangulo1.calcularHipotenusa());
        System.out.printf("Perimetro: %.2f%n", tRectangulo1.calcularPerimetro());
        System.out.printf("Area: %.2f%n", tRectangulo1.calcularArea());
        System.out.println(tRectangulo1);

        System.out.println("=======================");

        TrianguloRectanguloV1 tRectangulo2 = new TrianguloRectanguloV1(6, 9);
        System.out.println(tRectangulo2);
    }
}
