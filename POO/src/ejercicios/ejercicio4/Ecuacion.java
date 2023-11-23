package ejercicios.ejercicio4;

public record Ecuacion (int a, int b, int c, int d, int e, int f) {
    public boolean esResoluble1() {
        return a * d - b * c != 0;
    }

    public double devolverX() {
        return -b - Math.sqrt(b * b - 4 * a * c) / (2 * a);
    }

    public double devolverY() {
        return -b + Math.sqrt(b * b - 4 * a * c) / (2 * a);
    }




}
