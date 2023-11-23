package ejercicios.ejercicio1;

public class Cilindro {
    private float radio;
    private float altura;



    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float ancho) {
        this.altura = altura;
    }



    //tres metodos: calculo de la superficie y calculo del volumen
    public float getSuperficie () {
        return (float) ((2 * Math.PI * radio * altura) + (2 * Math.PI * (radio * radio) ));
    }

    public float getVolumen () {
        return (float) ((Math.PI * (radio * radio) * altura));
    }

    @Override
    public String toString() {
        return String.format("Los datos del cilindro de radio %.2f y una altura de 5.2f tiene%nVolumen = %.2f%nSuperficie = %.2f%n",
                radio, altura, getVolumen(), getSuperficie());
    }
}
