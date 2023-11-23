package teoria;

//java 3 * 2 y devuelve 6
//java 3 - 2 y devuelve 1
public class Argumentos {
    public static void main(String[] args) {
        //Comprobar que llegan 3 argumentos
        if (args.length != 3) {
            System.out.println("Faltan argumentos");
            //System.exit(1); //Acaba el programa
            return;
        } else
            System.out.println("Leidos argumentos");
            //Convertimos y creamos las variables
            int numero1 = Integer.parseInt(args[0]);
            String operador = args[1];
            int numero2 = Integer.parseInt(args[2]);
            //Segun el operador hacemos la operacion
            switch (operador) {
                case "*" -> System.out.printf("%d %s %d = %d%n",
                                numero1, operador, numero2, (numero1 * numero2));
                case "/" -> System.out.printf("%d %s %d = %d%n",
                        numero1, operador, numero2, (numero1 / numero2));
                case "+" -> System.out.printf("%d %s %d = %d%n",
                        numero1, operador, numero2, (numero1 + numero2));
                case "-" -> System.out.printf("%d %s %d = %d%n",
                        numero1, operador, numero2, (numero1 - numero2));
                default -> System.out.printf("%s : operacion no valida", operador);
            }
    }
}
