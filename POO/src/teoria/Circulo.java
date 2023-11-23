package teoria;


/**
 * Clase Circulo, con metodos para calcular superficie y longitud
 * @author manana
 * @version 1.0.0
 */
public class Circulo {
    private float radio = 10;

    /**
     * Getter del atributo radio
     * @return el valor del radio
     */

    public float getRadio() {
        return radio;
    }

    /**
     * Metodo que calcula la superficie del circulo
     * @return
     */

    public float getSuperficie() {
        return (float) (2 * Math.PI * radio);
    }

    /**
     * Metodo que calcula la longitud del circulo
     * @return
     */

    public float getPerimetro() {
        return (float) (2 * Math.PI * radio);
    }
}
