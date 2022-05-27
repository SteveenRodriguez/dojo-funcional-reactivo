package ejercicioTres;

import java.util.Scanner;
import java.util.function.BiFunction;

public class OperacionesCalculo {

    /**
     * Crear dos funciones, una para resolver derivadas y otra integrales,
     * pero esta se deben usar si quiero hacer la contraria, es decir,
     * si quiero hacer una derivada inversa o una integral inversa.
     */

    private Double coeficiente, potencia, x, xc, xp;
    private Double numero;

    public OperacionesCalculo(Double coeficiente, Double potencia) {
        this.coeficiente = coeficiente;
        this.potencia = potencia;
        this.x = 0.0;
        this.xc = 0.0;
        this.xp = 0.0;
        this.numero = 1.0;
    }

    public String calcularDerivada(){
        BiFunction<Double, Double, Double> xc = (coeficiente, potencia) -> coeficiente * potencia;
        BiFunction<Double, Double, Double> xp = (numero, potencia) -> potencia - numero;
        String respuesta = "La derivada es: " + xc.apply(coeficiente, potencia ) + "x^" + xp.apply(numero, potencia) + "\n";
        return respuesta;
    }

    public String calcularIntegral(){
        BiFunction<Double, Double, Double> xp = (numero, potencia) -> potencia + numero;
        BiFunction<Double, Double, Double> xc = (coeficiente, potencia) -> coeficiente / xp.apply(numero, potencia);
        String respuesta = "La Integral es: " + xc.apply(coeficiente, potencia ) + "x^" + xp.apply(numero, potencia) + "\n";
        return respuesta;
    }

}
