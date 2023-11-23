package ejercicios.ejercicio1;

public class TestCilindro {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro(); //creando un objeto Circulo
        cilindro1.setAltura(20);
        cilindro1.setRadio(3);
        //Mostramos los datos del nuevo cilindro1
        System.out.printf("Altura: %d%n", cilindro1.getAltura());
        System.out.printf("Radio: %d%n", cilindro1.getRadio());
        System.out.printf("Superficie: %d%n", cilindro1.getSuperficie());
        System.out.printf("Volumen: %d%n", cilindro1.getVolumen());
        System.out.println(cilindro1);

        System.out.println("=======================");
        CilindroV1 cilindro2 = new CilindroV1(7, 11);
        System.out.println(cilindro2);
        //trabajando con record
        System.out.println("========V2 Record=======");
        CilindroV2 cilindro3 = new CilindroV2(8, 9);
        System.out.println(cilindro3);
        CilindroV2 cilindro4 = new CilindroV2(8, 9);
        System.out.println(cilindro4);
        CilindroV2 cilindro5 = new CilindroV2(8,12);
        System.out.println(cilindro5);


    }
}