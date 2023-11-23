package teoria;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println(persona1);
        persona1.setEdad((persona1.getEdad()) + 1);//Un año mas viejo
        System.out.println(persona1);
        persona1.setNombreCompleto("Juani Goytisolo");//Cambia la edad
        System.out.println(persona1);

        System.out.println("=====================================");

        Persona persona2 = new Persona();
        persona2.setNombreCompleto("Joaquin Ariza");
        persona2.setEdad(17);
        System.out.println(persona2);
        persona2.setEdad(persona2.getEdad() + 5);//5 años despues
        System.out.println(persona2);

        System.out.println("=====================================");

        Persona persona3 = new Persona(39);
        System.out.println(persona3);
        persona3.setNombreCompleto("Felisa Rodriguez");
        System.out.println(persona3);

        System.out.println("=====================================");

        System.out.printf("¿Es mayor de edad %S? %B%n",
                persona1.getNombreCompleto(), persona1.mayorEdad());


        System.out.printf("¿Es mayor de edad %S? %B%n",
                persona2.getNombreCompleto(), persona2.mayorEdad());

                System.out.printf("¿Es mayor de edad %S? %B%n",
                        persona2.getNombreCompleto(), persona2.mayorEdad());
    }
}
