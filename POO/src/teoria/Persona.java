package teoria;
//ejemplo sencillo de creacion de constructores

public class Persona {
    private String nombreCompleto;
    private int edad;

    public Persona() {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public Persona(int i) {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public boolean mayorEdad() {
        return edad >= 18;
    }


    @Override
    public String toString() {
        return String.format("%S: %d%n",
                nombreCompleto, edad);
    }



}
