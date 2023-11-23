package ejercicios.ejercicio1;

public class CilindroV1 {
    private float radio;
    private float altura;


    public CilindroV1(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public CilindroV1(int altura) {
        /*radio = 5;
        this.altura = altura */
        this(5,altura);
    }

    public CilindroV1() {
        this(6,6);
    }

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



    //Dos metodos: calculo de la SUPERFICIE y calculo del VOLUMEN
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

