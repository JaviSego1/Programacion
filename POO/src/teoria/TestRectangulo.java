package teoria;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(); //creando un objeto Rectangulo
        System.out.println(rectangulo1.toString());
        System.out.println(rectangulo1.getAlto());
        rectangulo1.setAlto(5);
        System.out.println(rectangulo1.getAlto());

        //////////////////////////////////////////

        System.out.println("===========================");
        Rectangulo rectangulo2 = new Rectangulo(); //creando otro objeto Rectangulo
        rectangulo2.setAncho(6);
        rectangulo2.setAlto(11);
        System.out.printf("Rectangulo: %d de ancho y %d de alto%n" ,
                rectangulo2.getAncho(), rectangulo2.getAlto());

        //////////////////////////////////////////

        System.out.println("===========================");
        System.out.printf("Area %n", rectangulo2.getArea());
        System.out.printf("Perimetro %n", rectangulo2.getPerimetro());
        System.out.printf("Diagonal %2f%n", rectangulo2.getDiagonal());
        System.out.println(rectangulo2);
    }
}
