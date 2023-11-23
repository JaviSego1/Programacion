package Ejercicios;

public class Helper {
    public static double calcularValorMedio (int valor1, int valor2) {

        return (float) (valor1 + valor2) / 2;
    }

    public static float calcularRaizCuadrada(int valor) {
        return (float) Math.sqrt(valor);
    }

    public static int[] devolverDosCuadrados(int valor1, int valor2) {
        int[] cuadrados = new int[2];
        cuadrados[0] = valor1 * valor1;
        cuadrados[1] = valor2 * valor2;
        return cuadrados;
        //[4, 16]
    }

    public static int devolverMayorValor (int valor1, int valor2) {

        return Math.max(valor1, valor2);
    }

    public static int devolverMenorValor (int valor1, int valor2, int valor3) {
        return Math.min(Math.min(valor1, valor2), valor3);
    }

    public static boolean esPrimo (int valor) {
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0)
                return false;
        }
        return true;
    }

    public static String esParOImpar (int valor) {
        if (valor % 2 == 0)
            return "PAR";
        return "IMPAR";
    }

    //metodo pasamos dos numeros enteros y nos diga si el primero es disivible por el segundo

    public static boolean esDivisible (int valor1, int valor2) {
        if (valor1 % valor2 == 0)
            return true;
        return false;
    }
}
